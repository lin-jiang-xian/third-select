package com.tianshu.web.thirdselect.service.impl;

import com.tianshu.web.thirdselect.beans.Prefecture;
import com.tianshu.web.thirdselect.dao.PrefectureDao;
import com.tianshu.web.thirdselect.service.PrefectureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("prefectureService")
public class PrefectureServiceImpl implements PrefectureService {

    @Resource(name = "prefectureDao")
    private PrefectureDao dao;

    @Override
    public List<Prefecture> queryPrefectureByPid(int pid) {
        return dao.selectPrefectureByPid(pid);
    }
}
