package com.morea.dao;

import com.morea.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    int insertUser(User user);
    int deleteUserById(Integer id);
    int updateUser(User user);
    User queryUserByID(Integer id);
    List<User> queryAllUser();
}
