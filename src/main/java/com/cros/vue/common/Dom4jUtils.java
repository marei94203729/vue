package com.cros.vue.common;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author MaLei
 * @description: Dom4j工具类
 *          //根节点
 *         Element rootnode  = doc.getRootElement();
 *         //获取head节点
 *         Iterator headnode =  rootnode.elementIterator("head");
 * @create 2020/8/21
 */
public class Dom4jUtils {
    /**
     * 解析远程 XML 文件
     * @param url xml文件url 或
     * @return Document xml 文档
     * @throws DocumentException
     */
    public static Document parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document =reader.read(url);
        return document;
    }

    /**
     * 通过inputStream解析xml文件
     * 可结合springboot的Resource加载器来加载类路径下的xml文件
     * @param inputStream
     * @return Document xml 文档
     * @throws DocumentException
     */
    public static Document parse(InputStream inputStream)throws DocumentException{
        SAXReader reader = new SAXReader();
        //通过builder.setEntityResolver(new NoOpEntityResolver())方法来隐蔽起dtd验证器
        //参考https://blog.csdn.net/xinyu0100/article/details/5737062
        reader.setValidation(false);
        reader.setEntityResolver(new EntityResolver() {
            String emptyDtd ="";
            ByteArrayInputStream byteIs = new ByteArrayInputStream(emptyDtd.getBytes());
            @Override
            public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
                //也可以输入dtd的文件地址进行解析
                return new InputSource(byteIs);
            }
        });
        Document document =reader.read(inputStream);
        return document;
    }
    /**
     * 创建一个 Document xml 文档
     * @param rootNode 根节点标志
     * @return Document xml 文档
     */
    public static Document createDocument(String rootNode) {
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(rootNode);

        Element author1 = root.addElement("author")
                .addAttribute("name", "James")
                .addAttribute("location", "UK")
                .addText("James Strachan");

        Element author2 = root.addElement("author")
                .addAttribute("name", "Bob")
                .addAttribute("location", "US")
                .addText("Bob McWhirter");

        return document;
    }

    /**
     * 向document xml 文档中增加元素节点
     * 注意xml文档必须包含在根节点中，所以第一个元素需要添加根节点
     * @param document document xml 文档
     * @param elementName 增加的元素名称
     * @return
     */
    public Element addElement(Document document,String elementName){
        Element element = document.addElement(elementName);
        return element;
    }
}
