package com.example.spring_aspect.service;

import com.example.spring_aspect.entity.UserLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLogService {

    /**
     * 批量查询
     * @param example
     * @return
     */
    List<UserLog> selectListByLog(UserLog example);



            int    insertSelective(UserLog example);
}
