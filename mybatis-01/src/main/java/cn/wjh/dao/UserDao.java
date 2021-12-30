package cn.wjh.dao;

import cn.wjh.pojo.User;

import java.util.List;

public interface UserDao {
   //查询所有信息

    List<User> getUserList();

   //模糊查询信息

    List<User> getUesrByName(String name);

    //增加信息

    boolean InsertUser(User user);

    //删除信息

    boolean DeletUser(int id);

    //修改信息

    boolean UpdateUser(User user);
}
