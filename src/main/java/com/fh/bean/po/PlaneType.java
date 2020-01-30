package com.fh.bean.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("jq_plane_type")
public class PlaneType {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String planeName; //机型名称
    private String typeName;//机型类型   大型 中型  小型
}
