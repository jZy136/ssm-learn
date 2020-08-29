package com.morea.service.impl;

import com.morea.dao.UserDao;
import com.morea.model.User;
import com.morea.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }
}
