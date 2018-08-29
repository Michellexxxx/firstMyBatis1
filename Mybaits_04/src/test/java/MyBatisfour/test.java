package MyBatisfour;

import MyBatisfour.dao.UserMapper;
import MyBatisfour.pojo.Student;
import MyBatisfour.pojo.Teacher;
import MyBatisfour.util.SqlsessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class test {

    static SqlSession session;
    static UserMapper mapper;
    static Scanner input = new Scanner(System.in);


        @Before
        public void befor() {


            session = SqlsessionUtil.getSession();
            mapper = session.getMapper(UserMapper.class);
        }

        @After
        public void after() {
            session.commit();
            session.close();
        }
    /*多对多*/
   /*  @Test
    public void selectTeacherByid(){
         Student student = mapper.selectTeachersByid(1);
         System.out.println(student);
     }

     @Test
    public  void  selectStudentByid(){
         Teacher teacher = mapper.selectStudentByid(1);
         System.out.println(teacher.getStudent());
     }*/

   /*自动一对多*/
   @Test
    public  void  selectTeacherByid(){
       List<Teacher> teachers = mapper.selectTeachreByid(1);
       for (Teacher item:teachers
            ) {
           System.out.println(item.getName());
       }
   }

    }
