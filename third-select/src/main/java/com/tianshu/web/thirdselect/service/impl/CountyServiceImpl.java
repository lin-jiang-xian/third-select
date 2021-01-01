package com.tianshu.web.thirdselect.service.impl;

import com.tianshu.web.thirdselect.beans.County;
import com.tianshu.web.thirdselect.dao.CountyDao;
import com.tianshu.web.thirdselect.service.CountyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("countyService")
public class CountyServiceImpl implements CountyService {

    @Resource(name = "countyDao")
    private CountyDao dao;

    @Override
    public List<County> queryCountyByPid(int pid) {
        return dao.selectCountyByPid(pid);
    }
}
