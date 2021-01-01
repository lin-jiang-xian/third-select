package com.tianshu.spring.web.dao;

import com.tianshu.spring.web.domain.Province;

import java.util.List;

public interface ProvinceDao {
    List<Province> selectAllProvince();

    List<Province> selectProvinceByIdWithCities(int id);
}
