package Mybatistwo.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlsessionUtil {
    private static SqlSessionFactory sf;

    private SqlsessionUtil(){

    }

    public static  synchronized SqlSession getSession(){

        /**
         * 读取MyBatis的核心文件才能相当于启动这个项目，利用字符流
         *
         */
        try {
            InputStream stream= Resources.getResourceAsStream("mybatis.xml");
            //创建SqlSessionFactory工厂
            if(sf==null){
                sf = new SqlSessionFactoryBuilder().build(stream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sf.openSession();
    }

}
