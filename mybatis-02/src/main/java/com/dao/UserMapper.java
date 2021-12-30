package com.dao;

import com.pojo.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 人来人往只是日常
 */
@SuppressWarnings("all")
public interface UserMapper {

    List<User>  getUsers();

    int addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

}
