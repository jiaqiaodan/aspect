package com.example.spring_aspect.mapper;

import com.example.spring_aspect.entity.User;
import com.example.spring_aspect.entity.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    /**
     * 批量查询
     * @param user
     * @return
     */
    List<User> selectListByPrimaryKey(@Param("param") Map<String, Object> map);

    /**
     * 单体查询
     * @param user
     * @return
     */
    User selectByUser(@Param("param") Map<String, Object> map);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}