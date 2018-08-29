package MyBatisix;

import MyBatisix.dao.UserMapper;
import MyBatisix.pojo.Student;
import MyBatisix.util.SqlsessionUtil;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class testshow_06 {
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
    /*Mysql的缓存依据是sql的id+SQL语句*/
    @Test
    public void selectStudentByid(){
        Student s=mapper.selectStudentByid(1);
        System.out.println("第一次查询"+s);
        s=mapper.selectStudentByid(1);
        System.out.println("第二次查询"+s);
    }
           /*验证*/
    @Test
      public void selectStudentByid2(){
        Student student=mapper.selectStudentByid(1);
        System.out.println(student);
        student=mapper.selectStudentByid2(1);
        System.out.println(student);
    }
    /*增删改对他的影响*/
    @Test
    public void  selectStudentByidAdd(){
        Student student1=mapper.selectStudentByid(1);
        System.out.println(student1);
        Student student = new Student();
        student.setSname("ss");
        mapper.addStudent(student);

    }

    @Test
    public void findAllpage(){
        PageHelper.startPage(1,2);
        List<Student> page = mapper.findAll();
        System.out.println(page);

    }
    @Test
    public void  addStudent(){
        Student ss=mapper.selectStudentByid(1);
        System.out.println("第一次查询"+ss);
        session.close();


        session = SqlsessionUtil.getSession();
        mapper = session.getMapper(UserMapper.class);
        ss=mapper.selectStudentByid(1);
        System.out.println("第二次"+ss);
    }
}
