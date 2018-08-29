package MyBatistwo;

import Mybatistwo.dao.UserMapper;
import Mybatistwo.pojo.Users;
import Mybatistwo.util.SqlsessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class mainTest {

    SqlSession session = null;
    UserMapper mapper = null;


    @Before
    public void befor() {
        System.out.println(11);

        session = SqlsessionUtil.getSession();
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void after() {
        System.out.println(33);
        session.commit();
        session.close();
    }

//    @Test
//    public void testAddMapper(){
//        System.out.println(22);
//        Users users=new Users();
//
//        users.setUserName("test2");
//        users.setPassword("123");
//        int num=mapper.addUser(users);
//        if(num>0){
//            System.out.println("成功");
//        }else {
//            System.out.println("失败");
//        }
//    }

    /**
     * 查询单个
     */
    @Test
    public void testselect() {
        Users users = new Users();
        users.setId(1);

        System.out.println(mapper.findUserByid(users));

    }

    /**
     * 查询全部
     */
    @Test
    public void testselectAll() {
        System.out.println(mapper.findAllUuser());
    }


    @Test
    public void add() {
        Users users = new Users();
        users.setUserName("老王");
        users.setPassword("123");
        mapper.addUser(users);
        System.out.println(users.getId());
        }

}
//          users.setId(1);

//         mapper.delete(users);
//        mapper.update(users);
//    }


