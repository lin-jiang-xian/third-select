package com.tianshu.web.thirdselect.controller;

import com.tianshu.web.thirdselect.beans.County;
import com.tianshu.web.thirdselect.beans.Prefecture;
import com.tianshu.web.thirdselect.beans.Province;
import com.tianshu.web.thirdselect.service.CountyService;
import com.tianshu.web.thirdselect.service.PrefectureService;
import com.tianshu.web.thirdselect.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller("cityServlet")
public class CityServlet {

    @Resource(name = "provinceService")
    private ProvinceService provinceService;
    @Resource(name = "prefectureService")
    private PrefectureService prefectureService;
    @Resource(name = "countyService")
    private CountyService countyService;

    @RequestMapping(value = "/province.do")
    @ResponseBody
    public List<Province> queryProvinceByPid(int pid){
        return provinceService.queryProvinceByPid(pid);
    }

    @RequestMapping(value = "/prefecture.do")
    @ResponseBody
    public List<Prefecture> queryPrefectureByPid(int pid){
        return prefectureService.queryPrefectureByPid(pid);
    }

    @RequestMapping(value = "/county.do")
    @ResponseBody
    public List<County> queryCountyByPid(int pid){
        return countyService.queryCountyByPid(pid);
    }

}
