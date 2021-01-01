package com.tianshu.spring.web.service;

import com.tianshu.spring.web.dao.ProvinceDao;
import com.tianshu.spring.web.domain.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {

    @Resource(name = "provinceDao")
    private ProvinceDao provinceDao;

    @Override
    public List<Province> queryAllProvince() {
        return provinceDao.selectAllProvince();
    }
}
