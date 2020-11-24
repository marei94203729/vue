package com.cros.vue.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author MaLei
 * @description: JackJson金额格式化类,使用注解@JsonSerialize(using = AmountSerializerUtils.class)标记在要格式化输出的属性上
 * @create 2020/11/10
 */
public class AmountSerializerUtils extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal bigDecimal, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if(bigDecimal!=null){
            //DecimalFormat df = new DecimalFormat("0.00");
            //df.setRoundingMode(RoundingMode.HALF_UP);//四舍五入
            //jsonGenerator.writeString(df.format(bigDecimal.doubleValue()));
            jsonGenerator.writeString(bigDecimal.setScale(2,RoundingMode.HALF_UP).toString());
        }else{
            jsonGenerator.writeString((String)null);
        }
    }
}
