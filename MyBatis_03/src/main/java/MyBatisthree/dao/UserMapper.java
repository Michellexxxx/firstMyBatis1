package MyBatisthree.dao;

import MyBatisthree.pojo.country;
import MyBatisthree.pojo.provice;

public interface UserMapper {
  country   selectCountrybyid(Integer id);

  provice selectprovicebyid(Integer id);
}
