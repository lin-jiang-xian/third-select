package com.tianshu.spring.web.service;

import com.tianshu.spring.web.dao.CityDao;
import com.tianshu.spring.web.domain.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cityService")
public class CityServiceImpl implements CityService {

    @Resource(name = "cityDao")
    private CityDao cityDao;

    @Override
    public List<City> queryCityByPid(int pid) {
        return cityDao.selectCityByPid(pid);
    }
}
