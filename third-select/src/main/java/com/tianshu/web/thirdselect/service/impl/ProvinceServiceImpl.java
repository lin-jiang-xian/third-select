package com.tianshu.web.thirdselect.service.impl;

import com.tianshu.web.thirdselect.beans.Province;
import com.tianshu.web.thirdselect.dao.ProvinceDao;
import com.tianshu.web.thirdselect.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {

    @Resource(name = "provinceDao")
    private ProvinceDao dao;

    @Override
    public List<Province> queryProvinceByPid(int pid) {
        return dao.selectProvinceByPid(pid);
    }
}
