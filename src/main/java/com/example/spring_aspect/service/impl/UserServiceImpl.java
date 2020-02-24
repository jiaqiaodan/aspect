package com.example.spring_aspect.service.impl;

import com.example.spring_aspect.entity.User;
import com.example.spring_aspect.mapper.UserMapper;
import com.example.spring_aspect.service.UserService;
import com.example.spring_aspect.utils.EntityUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectOne(User u) {
        Map<String, Object> map = EntityUtils.entityToMap(u);
        return userMapper.selectByUser(map);
    }

    @Override
    public List<User> selectList(User u) {
        Map<String, Object> map = EntityUtils.entityToMap(u);
        List<User> users = userMapper.selectListByPrimaryKey(map);
        return users;
    }
}
