package Mybatistwo.util;

import Mybatistwo.dao.UserMapper;
import Mybatistwo.pojo.Users;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;

import java.util.List;
import java.util.Scanner;

public class Mainprogram {
    static SqlSession session;
    static UserMapper mapper;
    static Scanner input=new Scanner(System.in);
@After
public static void after(){
    session.commit();
    session.close();
}
    public static void main(String[] args) {
        String answer;
        session= SqlsessionUtil.getSession();
        mapper=session.getMapper(UserMapper.class);

        System.out.println("请输入用户名：");
        String Name=input.next();
        System.out.println("请输入密码：");
        String  pwd=input.next();
        int num= mapper.login(Name,pwd);
        if(num>0) {
            System.out.println("登录成功！");
            do {
                System.out.println("1.查询全部");
                System.out.println("2.删除");
                System.out.println("3.修改");
                System.out.println("请选择");
                int choose = input.nextInt();
                switch (choose) {
                    case 1:
                        findAll();
                        break;
                    case 2:
                        deletechoose();
                        break;
                    case 3:
                        update();
                        break;
                }
                System.out.println("");
                System.out.println("是否继续:是(Y)/否(N)");
                answer=input.next();
            }while (answer.equalsIgnoreCase("y"));
            }else{
                System.out.println("失败");
            }



    }

    private static void update() {
        Users users=new Users();
        System.out.println("请输入修改的id");
        int id=input.nextInt();
        System.out.println("请输入修改的用户名：");
        String newName=input.next();
        System.out.println("请输入修改的密码：");
        String newpassword=input.next();
        users.setId(id);
        users.setUserName(newName);
        users.setPassword(newpassword);
        int count=mapper.updatechoose(users);
        if (count>0){
            after();
            System.out.println("修改成功！");
        }else{
            System.out.println("修改失败！");
        }

    }

    public static void deletechoose() {

        Users users=new Users();
        System.out.println("请选择形式：1.id 2.用户名 3.密码 进行删除");
        int choosemo=input.nextInt();
        switch (choosemo){
            case 1:
                System.out.println("请输入id");
                int id=input.nextInt();

                users.setId(id);
              int i=mapper.deletechoose(users);
                after();
              if(i>0){
                  System.out.println("删除成功！");
              }else {
                  System.out.println("没有此ID！");
              }
                break;
            case 2:
                System.out.println("请输入用户名");
                String name=input.next();
                users.setUserName(name);
                int i1=mapper.deletechoose(users);
                after();
                if(i1>0){
                    System.out.println("删除成功！");
                }else {
                    System.out.println("没有此用户！");
                }
                break;
            case 3:
                System.out.println("请输入密码！");
                String pwd=input.next();
                users.setUserName(pwd);
                int i2=mapper.deletechoose(users);
                after();
                if(i2>0){
                    System.out.println("删除成功！");
                }else {
                    System.out.println("没有此此密码！");
                }
                break;
        }

    }

    private static void findAll() {
        List<Users> allUuser = mapper.findAllUuser();
        for (Users temp: allUuser) {
            System.out.print("姓名:"+temp.getUserName());
            System.out.print("  ");
            System.out.print("密码："+temp.getPassword());
            System.out.println();
        }

    }
}
