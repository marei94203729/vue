package com.cros.vue.service;

import com.cros.vue.common.ExcelUtil;
import com.cros.vue.pojo.Column;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author MaLei
 * @description: excel服务操作类
 * @create 2020/9/14
 */
@Slf4j
@Component
public class ExcelService {
    /**
     * 配置response响应头设置
     * @param response
     * @param fileName 响应流中excel文件名
     * @throws UnsupportedEncodingException
     */
    private void setResponseHeader(HttpServletResponse response,String fileName) throws UnsupportedEncodingException {
        //String fileName = "Excel-" + String.valueOf(System.currentTimeMillis()).substring(4, 13) + ".xlsx";
        // 解决导出文件名中文乱码
        response.setCharacterEncoding("UTF-8");
        //设置内容返回格式
        response.setContentType("application/octet-stream;charset=UTF-8");
        //设置返回文件名称
        response.setHeader("Content-Disposition", String.format("attachment; filename=%s", new String(fileName.getBytes("UTF-8"), "ISO-8859-1")));
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
    }
    /**
     * 导出excel的HSSFWorkbook
     * @param list 查询数据集合
     * @param customQueryHeads 导出的列头
     * @param response response输出流(用后要关闭)
     * @return
     */
    public void exportExcel(List<?> list, Set<Column> customQueryHeads, HttpServletResponse response){
        try {
            @Cleanup Workbook workbook= ExcelUtil.createWorkbook(ExcelUtil.ExcelFileType.Excel2007);
            //设置返回文件名称
            String fileName =String.format("%s%s%s%s", "excel-", String.valueOf(System.currentTimeMillis()).substring(4, 13),"." , ExcelUtil.ExcelFileType.Excel2007.getName());
            //响应流相关设置
            setResponseHeader(response,fileName);
            Sheet sheet = workbook.createSheet("sheet1");
            Row row = sheet.createRow(0);
            //设置行高为两倍默认行高
            row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));
            //去掉编辑列
            List<Column> heads=customQueryHeads.stream().filter(s->
                    !StringUtils.equals(s.getLabel().trim(), "编辑")
            ).collect(Collectors.toList());
            // excle标题
            Iterator<Column> it=heads.iterator();
            //设置单元格字体加粗
            Font font=ExcelUtil.createFont(workbook);
            font.setBold(true);
            CellStyle cellStyle=ExcelUtil.createCellStyle(workbook);
            //垂直居中
            cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            cellStyle.setFont(font);
            int col_index=0;//列索引
            while (it.hasNext()) {
                Column col=it.next();
                if(col.getProp()!=null) {
                    Cell cell = row.createCell(col_index);
                    //行头字体加粗样式
                    cell.setCellStyle(cellStyle);
                    cell.setCellValue(col.getLabel());
                    sheet.setColumnWidth(col_index, col.getLabel().getBytes().length * 350);
                    //设置根据内容自动调整列宽
                    //sheet.autoSizeColumn(col_index);
                    col_index++;
                }
            }
            //excel 内容
            Iterator<?> item=list.iterator();
            int row_index=1;//行索引由于第一行索引0是表头，所以从1开始
            while (item.hasNext()) {
                Object o=(Object) item.next();
                Row _row = sheet.createRow(row_index);//增加一行
                //设置行高为两倍默认行高
                _row.setHeightInPoints((2*sheet.getDefaultRowHeightInPoints()));
                row_index++;
                //使用反射读取对应的值
                Class<?> zlass= o.getClass();
                //枚举字段
                for (Field f:zlass.getDeclaredFields()){
                    f.setAccessible(true);
                    Iterator<Column> itc=heads.iterator();
                   // int _col_index=0;//从第一行开始
                    while (itc.hasNext()) {
                        Column col=itc.next();
                        if(StringUtils.equals(col.getProp(),f.getName())){
                            //字段与配置相同时且不是日期类型时
                            if(!f.getType().getSimpleName().equals("Date")){
                                _row.createCell(col.getOrder()-1<0?0:col.getOrder()-1).setCellValue(f.get(o)==null?"":f.get(o).toString());
                            }else {//日期类型需要格式化
                                if(f.get(o)!=null)
                                _row.createCell(col.getOrder()-1<0?0:col.getOrder()-1).setCellValue(DateFormatUtils.format((Date) f.get(o),"yyyy-MM-dd HH-mm-ss"));
                            }
                           // _col_index++;
                            break;
                        }
                    }
                }

            }
            //获取输出流
           @Cleanup OutputStream outputStream = response.getOutputStream();
            workbook.write(outputStream);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
    }
}
