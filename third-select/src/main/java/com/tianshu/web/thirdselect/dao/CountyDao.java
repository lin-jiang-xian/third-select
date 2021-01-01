package com.tianshu.web.thirdselect.dao;

import com.tianshu.web.thirdselect.beans.County;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountyDao {

    List<County> selectCountyByPid(@Param("pid")int pid);

}
