package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/**
 * Created by hyun ji Ra on 2017-08-30.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:web\\WEB-INF\\applicationContext.xml");
        Student  student = context.getBean("student",Student.class);
        student.getStudentInfo();
        student.printStudent();

        Worker worker = context.getBean("worker",Worker.class);
        worker.getWorkerInfo();
        worker.printWorker();
    }
}
