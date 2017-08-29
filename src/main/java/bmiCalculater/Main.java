package bmiCalculater;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.AbstractSequentialList;

/**
 * Created by hyun ji Ra on 2017-08-27.
 */
/*xml로 DI 설정 방법*/
public class Main {
    public static void main(String[] args){
        //스프링 버전에 따라 밑에 양식은 다르다...
        ApplicationContext context = new ClassPathXmlApplicationContext("file:web\\WEB-INF\\applicationContext.xml");
        MyInfo myInfo = context.getBean("myinfo2",MyInfo.class); // applicationContext.xml 에서 설정한 bean의 id값과 일치해야함..
        myInfo.getinfo();
    }
}
