package MyBatisix.dao;




import MyBatisix.pojo.Student;

import java.io.Serializable;
import java.util.List;

public interface UserMapper {

  /*一级缓存*/

  Student selectStudentByid(Serializable id);

  /*验证缓存的办法*/

  Student selectStudentByid2(Serializable id);

  void addStudent(Student stu);

  List<Student> findAll();


}
