package cn.wjh.dao;

import cn.wjh.pojo.User;
import cn.wjh.util.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    //查询所有信息
    public void test(){
        SqlSession sqlSession= Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList=mapper.getUserList();
        for (User user:userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    //模糊查询
    public void getName(){
        SqlSession sqlSession= Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList=mapper.getUesrByName("涵");
        for (User user:userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    //插入测试
    public void InsertUser(){
        SqlSession sqlSession= Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        boolean rs=mapper.InsertUser(new User(4,"黄红","123456"));//新增信息
        if(rs){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    // 删除测试
    public void DeleteUser(){
        SqlSession sqlSession= Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        boolean rs=mapper.DeletUser(4);//删除4号id
        if(rs){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    // 删除测试
    public void UpdateUser(){
        SqlSession sqlSession= Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        boolean rs=mapper.UpdateUser(new User(4,"黄红","123456"));//删除4号id
        if(rs){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
        sqlSession.commit();
        sqlSession.close();
    }


}
