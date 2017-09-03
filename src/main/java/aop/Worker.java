package aop;

/**
 * Created by hyun ji Ra on 2017-08-30.
 */
public class Worker {
    private String name;
    private int age;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public  void getWorkerInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("직업: " + getJob());
    }
    public void printWorker(){
        System.out.println("안녕하세요 이것은 printWorker 메소드입니당");

    }
}
