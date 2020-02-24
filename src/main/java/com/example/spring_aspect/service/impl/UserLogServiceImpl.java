package com.example.spring_aspect.service.impl;

import com.example.spring_aspect.entity.UserLog;
import com.example.spring_aspect.mapper.UserLogMapper;
import com.example.spring_aspect.service.UserLogService;
import com.example.spring_aspect.utils.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserLogServiceImpl implements UserLogService {

    @Autowired
    private UserLogMapper userLogMapper;


    @Override
    public List<UserLog> selectListByLog(UserLog example) {
        Map<String, Object> map = EntityUtils.entityToMap(example);
        return userLogMapper.selectListByLog(map);
    }

    @Override
    public int insertSelective(UserLog example) {
        return userLogMapper.insert( example);
    }


}
