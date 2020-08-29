package com.morea.service;

import com.morea.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> queryAllUser();
}
