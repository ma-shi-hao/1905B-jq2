package com.fh.controller;

import com.fh.bean.po.Area;
import com.fh.bean.po.Flight;
import com.fh.bean.po.PlaneType;
import com.fh.service.FlightService;
import com.fh.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @RequestMapping("/queryPlaneList")
    public Map  queryPlaneList(){
        Map map=new HashMap();
        List<PlaneType> planeTypeList=flightService.queryPlaneList();
        map.put("data",planeTypeList);
        return map;
    }
    @RequestMapping("/queryAreaList")
    public Map  queryAreaList(){
        Map map=new HashMap();
        List<Area> areaList=flightService.queryAreaList();
        map.put("data",areaList);
        return map;
    }
    @RequestMapping("/queryTwo")
    public Map queryTwo(Integer id){
        Map map=new HashMap();
        List<Area> areaList=flightService.queryTwo(id);
        map.put("data",areaList);
        return map;
    }
    @RequestMapping("/queryThree")
    public Map queryThree(Integer id){
           Map map=new HashMap();
           List<Area> areaList=flightService.queryThree(id);
           map.put("data",areaList);
           return map;
    }
    @RequestMapping("/addFlight")
    public Flight addFlight(Flight flight){
         flightService.addFlight(flight);
        return flight;
    }

    @RequestMapping("/queryPageList")
    public PageBean<Flight> queryPageList(PageBean<Flight> page){
        flightService.queryPageList(page);
          return page;
    }
}
