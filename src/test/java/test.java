import com.liwenjie.Dos.Impl.UserDaoImpl;
import com.liwenjie.Dos.Impl.UserDaoOracleImpl;
import com.liwenjie.pojo.*;
import com.liwenjie.service.UserService;
import com.liwenjie.service.Impl.UserServiceImpl;
import com.sun.jndi.cosnaming.CNCtx;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
    @Test
    public void test1() {
//       UserService userService=new UserServiceImpl();
        UserServiceImpl service = new UserServiceImpl();

        service.setUserDao(new UserDaoImpl());

        service.getUser();

        //
        service.setUserDao(new UserDaoOracleImpl());

        service.getUser();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) context.getBean("Hello");
        hello.show();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) context.getBean("ServiceImpl");
        service.getUser();
    }

    /*
     * ioc创建对象方式
     * 通过无参构造创建*/
    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();
    }

    /*
     * ioc创建对象方式
     * 通过有参构造创建
     * 三种方式*/
    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT userT = (UserT) context.getBean("useru1");//可通过别名获取
        userT.show();
    }

    /*
     * 多种注入方法（（set）重点*/
    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("path.xml");
        Student student = (Student) context.getBean("student");
//        System.out.println(student.name);
        student.show();
    }

    /* p c  明名注入
     * */
    @Test
    public void test7() {
        ApplicationContext context = new ClassPathXmlApplicationContext("pCSpace.xml");
        User userP = (User) context.getBean("userP");
        User userC = (User) context.getBean("userC");
        System.out.println(userP);
        System.out.println("加上有参构造");
        System.out.println(userC);
    }

    /*
     * 单列
     * 多列
     * */
    @Test
    public void test8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Single.xml");
        User user = (User) context.getBean("single1");
        User user1 = (User) context.getBean("single1");

        System.out.println(user == user1);//原型模式->true 单列模式->false
    }

//    @Test
//    public void DC() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("userDC.xml");
//        UserDC userDC = (UserDC) context.getBean("userDC1");
//        userDC.getCat().shout();
//        userDC.getDog().shout();
//        System.out.println(userDC.getStr());
//    }

    @Test
    public void DC2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userDC.xml");
        UserDC userDC =(UserDC) context.getBean("userDC");
        userDC.getDog().shout();
    }
}
