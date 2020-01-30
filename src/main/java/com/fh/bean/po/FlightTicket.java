package com.fh.bean.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("jq_flight_ticket")
public class FlightTicket {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer fligId;//航班ID
    private String ticketType;//机票类型 经济仓 头等舱
    private Integer totalCount;//票数
    private Double price; //票价
}
