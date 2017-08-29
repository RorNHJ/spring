package student;

import bmiCalculater.MyInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hyun ji Ra on 2017-08-29.
 */
public class Main{
    public static void main(String[] args){
        /*스프링 컨테이너 생명주기*/
        //생성과 설정(이때 스프링의 빈 생명주기중 afterPropertiesSet()이 호출됨..
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


        ApplicationContext context = new ClassPathXmlApplicationContext("file:web\\WEB-INF\\applicationContext.xml");

        //사용
//        Student student1 = context.getBean("student1",Student.class);
//        System.out.println("이름: " + student1.getName());
//        System.out.println("나이: " + student1.getAge());
//        System.out.println("취미: " + student1.getHobbys());
//        System.out.println("신장: " + student1.getHeight());
//        System.out.println("몸무게: " + student1.getWeight());
//
//        Student student2 = context.getBean("student2",Student.class);
//        System.out.println("이름: " + student2.getName());
//        System.out.println("나이: " + student2.getAge());
//        System.out.println("취미: " + student2.getHobbys());
//        System.out.println("신장: " + student2.getHeight());
//        System.out.println("몸무게: " + student2.getWeight());

        //종료(이때 스프링의 빈 생명주기 중 destroy() 가 호출됨)
//        context.close();
//
        Student student3 = context.getBean("student3",Student.class);
        System.out.println("이름: " + student3.getName());
        System.out.println("나이: " + student3.getAge());
        System.out.println("취미: " + student3.getHobbys());
        System.out.println("신장: " + student3.getHeight());
        System.out.println("몸무게: " + student3.getWeight());

    }

}
