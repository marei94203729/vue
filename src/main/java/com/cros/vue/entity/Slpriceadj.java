package com.cros.vue.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Slpriceadj implements Serializable {
    private Long id;



    private String docno;


    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date modifieddate;


    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT")
    private Date billdate;

    private String storefilter;

    private List<SlpriceadjpdtItem> items;
}