package com.fh.bean.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("jq_flight")
public class Flight {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;  //航班Id
    private String flightName;//航班名称
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;//起飞时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;//到达时间
    private Integer planeId;//机型ID
    private Integer areaId;//地区ID
    private Integer ticketId;

}
