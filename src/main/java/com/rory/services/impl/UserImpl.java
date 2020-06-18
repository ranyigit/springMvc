package com.rory.services.impl;

import com.rory.entity.User;
import com.rory.services.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserImpl implements IUserService {
    @Override
    public List<User> findAll() {
        System.out.println("业务层");
        return null;
    }
}
