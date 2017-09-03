package aop;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.ArrayList;

/**
 * Created by hyun ji Ra on 2017-08-29.
 */
public class Student implements InitializingBean,DisposableBean {
    private  String name;
    private  int age;
    private ArrayList<String> hobbys;
    private double height;
    private double weight;

    public Student(String name, int age, ArrayList<String> hobbys){
        this.name = name;
        this.age = age;
        this.hobbys =hobbys;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(ArrayList<String> hobbys) {
        this.hobbys = hobbys;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean을 임플리먼트하고 스프링 컨테이너 생명주기 중 생성과 설정 단계에서 스프링의 빈 생명주기의 afterPropertiesSet()이 호출됨.aa.");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean을 임플리먼트하고 스프링 컨테이너 생명주기 중 소멸 단계에서 스프링의 빈 생명주기의 afterPropertiesSet()이 호출됨..");

    }
    public  void getStudentInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("취미: " + getHobbys());
        System.out.println("신장: " + getHeight());
        System.out.println("몸무게: " + getWeight());
    }

    public void printStudent(){
        System.out.println("안녕하세요 이것은 프린트스튜던트 메소드입니당");

    }

//    @PostConstruct // 굳이 InitializingBean을 임플리먼트 안해도 어노테이션으로 간단하게 처리 가능
//    public void initMethod(){
//       System.out.println("굳이 InitializingBean을 임플리먼트 안해도 어노테이션으로 간단하게 처리 가능");
//    }
//
//    @PreDestroy // 굳이 DisposableBean을 임플리먼트 안해도 어노테이션으로 간단하게 처리 가능
//    public void destroyMethod(){
//       System.out.println("굳이 DisposableBean을 임플리먼트 안해도 어노테이션으로 간단하게 처리 가능");

//    }
}
