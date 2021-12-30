package cn.wjh.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class Mybatisutil {
    private static SqlSessionFactory sqlSessionFactory;
    static {

        try {
            String resoures= "Mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resoures);
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
