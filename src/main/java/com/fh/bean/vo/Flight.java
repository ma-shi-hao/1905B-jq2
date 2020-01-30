package com.fh.bean.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Flight {
    private Integer id;  //航班Id
    private String flightName;//航班名称
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date startTime;//起飞时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date endTime;//到达时间

    private Integer ticketId;


    private Integer planeId;//机型ID
    private String planeName;


    private String areaName;//地区ID
    private Integer areaId;

    private Integer totalCount;//票数
    private Double price; //票价

}
