package Mybatistwo.dao;

import Mybatistwo.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface UserMapper  {
    int addUser(Users users);

    int delete(Users users);

    int update(Users users);

    Users findUserByid(Users users);

    List<Users> findAllUuser();

    int login(@Param("userName") String userName, @Param("password") String password);

    int deletechoose(Users users );

    int updatechoose(Users users);


}
