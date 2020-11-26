package com.spare4fun.core.service;

import com.spare4fun.core.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean createUser(User user) {
        // dao ..
        // userDao.createUser(user);
        return true;
    }
}
