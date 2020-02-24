package com.example.spring_aspect.service;

import com.example.spring_aspect.entity.User;

import java.util.List;

public interface UserService {


    User selectOne(User u);



    List<User> selectList(User u);

}
