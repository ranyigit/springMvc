package com.rory.services;

import com.rory.entity.User;

import java.util.List;

public interface IUserService {

    /**
     * 查找全部
     * @return
     */
    List<User> findAll();
}
