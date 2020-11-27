package com.spare4fun.core.service;

import com.spare4fun.core.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDao
                .selectApplicationUserByUsername(s)
                .orElseThrow(() ->
                        new UsernameNotFoundException(String.format("Username %s not found", s))
                );
    }
}
