package com.tianshu.spring.web.dao;

import com.tianshu.spring.web.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityDao {
    List<City> selectCityByPid(@Param("pid") int pid);
}
