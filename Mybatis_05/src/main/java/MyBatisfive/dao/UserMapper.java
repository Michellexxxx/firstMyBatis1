package MyBatisfive.dao;


import MyBatisfive.pojo.Teacher;

import java.io.Serializable;

public interface UserMapper {
  Teacher selectByteacherid(Serializable id);
}
