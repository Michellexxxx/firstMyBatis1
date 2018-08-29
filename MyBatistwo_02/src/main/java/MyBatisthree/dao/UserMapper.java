package MyBatisthree.dao;


import MyBatisthree.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper  {
    List<Users> findAllUser(Users users);

    int update(Users users);

    List<Users> selectBychoose(Users users);

    List<Users> selectforeach(int []dis);

   List<Users> selectList(List<Integer> dis);

   List<Users> selectlistUser(List<Users> dis);

    int insertManyUser(List<Users> dis);

    List<Users> selectMap(@Param("map") Map<String,Users> map);

    List<Users> selectMapone(@Param("map") Map<String,Integer> map);

    List<Users> selectMaptwo(@Param("map") Map<String,String> map);



}
