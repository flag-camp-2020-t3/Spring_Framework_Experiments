package com.spare4fun.core.dao;

import com.spare4fun.core.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Optional<User> selectApplicationUserByUsername(String username) {
        return Optional.empty();
    };
}
