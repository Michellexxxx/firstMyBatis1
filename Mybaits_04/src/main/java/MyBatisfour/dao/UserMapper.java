package MyBatisfour.dao;


import MyBatisfour.pojo.Student;
import MyBatisfour.pojo.Teacher;

import java.io.Serializable;
import java.util.List;

public interface UserMapper {
    /*多对多*/
  /* Student selectTeachersByid(Serializable id );

   Teacher selectStudentByid(Serializable id);*/

   /*自动一对多*/

   List<Teacher> selectTeachreByid(Serializable id);

   Teacher selectByteacherid(Serializable id);








}
