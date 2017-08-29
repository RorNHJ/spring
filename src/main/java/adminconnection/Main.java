package adminconnection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

/**
 * Created by hyun ji Ra on 2017-08-30.
 */
public class Main {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        try{
            propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
            System.out.println("adminId : " + environment.getProperty("admin.id"));
            System.out.println("adminId : " + environment.getProperty("admin.pw"));
        }catch (Exception e){
            e.printStackTrace();
        }

        GenericXmlApplicationContext gcontext = (GenericXmlApplicationContext)context;
        gcontext.load("file:web\\WEB-INF\\applicationContext.xml");
        gcontext.refresh();

        AdminConnection adminConnection = gcontext.getBean("adminConnection",AdminConnection.class);
        System.out.println("adminId : " + adminConnection.getAdminId());
        System.out.println("adminPw : " + adminConnection.getAdminPw());
        gcontext.close();
        context.close();
    }
}
