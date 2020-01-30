package com.fh.service.impl;

import com.fh.bean.po.Area;
import com.fh.bean.po.Flight;
import com.fh.bean.po.FlightTicket;
import com.fh.bean.po.PlaneType;
import com.fh.dao.FlightDao;
import com.fh.service.FlightService;
import com.fh.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Resource
    private FlightDao flightDao;

    @Override
    public List<PlaneType> queryPlaneList() {
        return flightDao.queryPlaneList();
    }

    @Override
    public List<Area> queryAreaList() {
        return flightDao.queryAreaList();
    }

    @Override
    public List<Area> queryTwo(Integer id) {
        return flightDao.queryTwo(id);
    }

    @Override
    public List<Area> queryThree(Integer id) {
        return flightDao.queryThree(id);
    }

    @Override
    public void addFlight(Flight flight) {
        FlightTicket flightTicket=flightDao.queryTicket();

        flightDao.insert(flight);
    }

    @Override
    public void queryPageList(PageBean<Flight> page) {
          Long count=flightDao.queryCount();
          page.setRecordsTotal(count);
          page.setRecordsFiltered(count);
          List<Flight> list=flightDao.queryPageList(page);
          page.setList(list);
    }

}
