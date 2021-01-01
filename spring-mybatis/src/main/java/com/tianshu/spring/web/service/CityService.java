package com.tianshu.spring.web.service;

import com.tianshu.spring.web.domain.City;

import java.util.List;

public interface CityService {
    List<City> queryCityByPid(int pid);
}
