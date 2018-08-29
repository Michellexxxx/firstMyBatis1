package MyBatisthree;

import MyBatisthree.dao.UserMapper;
import MyBatisthree.pojo.Users;
import MyBatisthree.util.SqlsessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usertest {
    SqlSession session = null;
    UserMapper mapper = null;


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


    @Test
    public void findAll(){
        Users users = new Users();

        users.setUserName("test1");
        List<Users> user=mapper.findAllUser(users);
        System.out.println(user);
    }
    @Test
    public  void updateone(){
        Users users = new Users();
        users.setId(1);
        users.setUserName("dai");
        users.setPassword("999");
        System.out.println(mapper.update(users));
    }
    @Test
    public  void findchoose(){
        Users users = new Users();
        users.setUserName("da");
        List<Users> user=mapper.selectBychoose(users);
        System.out.println(user);
    }
    @Test
    public  void foreachetest(){
        int [] dis={1,2,3};
        List<Users> users=mapper.selectforeach(dis);
        System.out.println(users);
    }
    @Test
    public void testList(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Users> users=mapper.selectList(list);
        System.out.println(users);
    }

    @Test
    public  void testListuser(){
        List<Users> list=new ArrayList<>();
        Users users1=new Users();
        Users users2=new Users();
        Users users3=new Users();
        users1.setId(1);
        users2.setId(2);
        users3.setId(3);
        list.add(users1);
        list.add(users2);
        list.add(users3);
        List<Users> user2=mapper.selectlistUser(list);
        System.out.println(user2);

    }

    @Test
    public void  testinsertmany(){
            List<Users> list=new ArrayList<Users>();
            Users user1=new Users("li888","919");
            Users user2=new Users("tan7g","612");

            list.add(user1);
            list.add(user2);
           mapper.insertManyUser(list);


    }
    @Test
    public void findByMapUsers(){
        Map<String,Users> map=new HashMap<>();
        Users u1=new Users();
        u1.setId(4);
        Users u2=new Users();
        u2.setId(5);
        Users u3=new Users();
        u3.setId(18);

        map.put("1",u1);
        map.put("2",u2);
        map.put("3",u3);

        System.out.println(mapper.selectMap(map));

    }
    @Test
    public void findByMapone(){
        Map<String,Integer> map=new HashMap<>();

        map.put("1",1);
        map.put("2",2);
        map.put("3",3);

        System.out.println(mapper.selectMapone(map));

    }


}
