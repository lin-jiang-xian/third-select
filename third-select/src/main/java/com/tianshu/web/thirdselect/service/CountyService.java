package com.tianshu.web.thirdselect.service;

import com.tianshu.web.thirdselect.beans.County;

import java.util.List;

public interface CountyService {

    List<County> queryCountyByPid(int pid);

}
