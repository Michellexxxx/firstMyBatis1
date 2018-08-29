package MyBatisfive;

import MyBatisfive.dao.UserMapper;
import MyBatisfive.pojo.Teacher;
import MyBatisfive.util.SqlsessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class test_02 {
    static SqlSession session;
    static UserMapper mapper;
    static Scanner input=new Scanner(System.in);


    @Before
    public void befor() {


        session = SqlsessionUtil.getSession();
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public  void after(){
        session.commit();
        session.close();
    }

    @Test
    public  void  selectteacherbyid(){
        Teacher teacher=mapper.selectByteacherid(2);
        System.out.println(teacher);
    }
}
