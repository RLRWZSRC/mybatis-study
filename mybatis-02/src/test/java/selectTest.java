import com.dao.UserMapper;
import com.pojo.User;
import com.utlis.IDUtils;
import com.utlis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class selectTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

    }
    @Test
    public void adduser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String uuid=IDUtils.getId().replaceAll("-","").toString();
        System.out.println(uuid);
        mapper.addUser(new User(1,uuid, "hh", "147258", new Date()));
        sqlSession.close();
    }
    @Test
    public void updateuser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String uuid=IDUtils.getId().replaceAll("-","").toString();
        System.out.println(uuid);
        mapper.updateUser(new User(6,uuid, "hh", "147258", new Date()));
        sqlSession.close();
    }
    @Test
    public void deleteuser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        sqlSession.close();
    }
}
