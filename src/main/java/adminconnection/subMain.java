package adminconnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by hyun ji Ra on 2017-08-30.
 */
public class subMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:web\\WEB-INF\\applicationContext.xml");
        AdminConnection connection = context.getBean("adminConnection",AdminConnection.class);
        System.out.println("subid : " + connection.getSubId());
        System.out.println("subpw : " + connection.getSubPw());

    }
}