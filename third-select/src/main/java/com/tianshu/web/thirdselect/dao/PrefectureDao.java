package com.tianshu.web.thirdselect.dao;

import com.tianshu.web.thirdselect.beans.Prefecture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrefectureDao {

    List<Prefecture> selectPrefectureByPid(@Param("pid")int pid);

}
