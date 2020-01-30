package com.fh.service;

import com.fh.bean.po.Area;
import com.fh.bean.po.Flight;
import com.fh.bean.po.PlaneType;
import com.fh.util.PageBean;

import java.util.List;

public interface FlightService {
    List<PlaneType> queryPlaneList();

    List<Area> queryAreaList();

    List<Area> queryTwo(Integer id);

    List<Area> queryThree(Integer id);

    void addFlight(Flight flight);

    void queryPageList(PageBean<Flight> page);
}
