package student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
/*자바로 DI 설정 방법*/
/**
 * Created by hyun ji Ra on 2017-08-29.
 */
@Configuration
//@ImportResource("classpath:applicationContext.xml")
// 스프링에서 스프링 설정파일(applicationContext.xml)로 쓰일 녀석입니다.
// IOC 컨테이너 역할
public class ApplicationConfig {
    @Bean // 객체 student1 선언하고 리턴..
    public Student student1(){
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("수영");
        hobbys.add("요리");

        Student student = new Student("라현지",24,hobbys);
        student.setHeight(154);
        student.setWeight(44.1);

        return student;

    }

    @Bean // 객체 student1 선언하고 리턴..
    public Student student2(){
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("독서");
        hobbys.add("자전거");

        Student student = new Student("김태환",27,hobbys);
        student.setHeight(174);
        student.setWeight(75);

        return student;

    }
}
