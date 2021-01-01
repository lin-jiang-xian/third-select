package com.tianshu.web.thirdselect.dao;

import com.tianshu.web.thirdselect.beans.Province;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvinceDao {

    List<Province> selectProvinceByPid(@Param("pid") int pid);

}
