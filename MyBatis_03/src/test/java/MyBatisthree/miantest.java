package MyBatisthree;

import MyBatisthree.dao.UserMapper;
import MyBatisthree.pojo.country;
import MyBatisthree.pojo.provice;
import MyBatisthree.util.SqlsessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class miantest {
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
    public void testcountry(){
        country cou=mapper.selectCountrybyid(3);
        System.out.println(cou.getcName());
    }

    @Test
    public void getCountLazyByid(){
        country cou=mapper.selectCountrybyid(1);
        System.out.println(cou.getcName());
        System.out.println(cou.getcName());
        System.out.println(cou.getProvices());
    }
    @Test
    public  void  getcountbyid(){
        provice pro=mapper.selectprovicebyid(2);
        System.out.println(pro.getpName());
        System.out.println(pro.getCou().getcName());
    }
}
