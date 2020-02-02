package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.bean.po.Area;
import com.fh.bean.po.Flight;
import com.fh.bean.po.FlightTicket;
import com.fh.bean.po.PlaneType;
import com.fh.util.PageBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FlightDao extends BaseMapper<Flight> {
    List<PlaneType> queryPlaneList();

    List<Area> queryAreaList();

    List<Area> queryTwo(Integer id);

    List<Area> queryThree(Integer id);

    Long queryCount();

    List<Flight> queryPageList(PageBean<Flight> page);

    FlightTicket queryTicket();

    List<Flight> queryName(Integer id);
}
