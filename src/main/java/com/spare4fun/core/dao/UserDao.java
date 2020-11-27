package com.spare4fun.core.dao;

import com.spare4fun.core.entity.User;
import com.spare4fun.core.exception.DuplicateUserException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Optional<User> selectApplicationUserByUsername(String username) {
        Optional<User> res = Optional.empty();
        Session session = null;
        try {
            String hql = "FROM User u WHERE u.email = :username";
            session = sessionFactory.openSession();
            session.beginTransaction();
            res = session
                    .createQuery(hql)
                    .setParameter("username", username)
                    .uniqueResultOptional();
            session.getTransaction().commit();
        } catch(Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return res;
    };

    /**
     * save new user to DB
     * @author Xinrong Zhao
     * @param user
     * @return
     * @throws
     *    DuplicateUserException - if duplicate user found
     *    Exception - otherwise
     */
    public void addUser(User user) throws Exception {
        Optional<User> dup = this.selectApplicationUserByUsername(user.getUsername());
        if (!dup.isEmpty()) {
            throw new DuplicateUserException("User " + user.getUsername() + " already exists");
        }

        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch(Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
