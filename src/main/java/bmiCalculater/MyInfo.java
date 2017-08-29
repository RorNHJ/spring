package bmiCalculater;

import java.util.ArrayList;

/**
 * Created by hyun ji Ra on 2017-08-27.
 */
public class MyInfo {
    private String name;
    private double height;
    private double weight;
    private ArrayList<String> hobby;
    private BMICalculater bmiCalculater;

    public MyInfo(String name, double height, double weight, ArrayList<String> hobby, BMICalculater bmiCalculater) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.bmiCalculater = bmiCalculater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<String> getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList<String> hobby) {
        this.hobby = hobby;
    }

    public BMICalculater getBmiCalculater() {
        return bmiCalculater;
    }

    public void setBmiCalculater(BMICalculater bmiCalculater) {
        this.bmiCalculater = bmiCalculater;
    }

    public void bmiCalculation(){
        bmiCalculater.bmiCalculation(weight,height);
    }

    public void getinfo(){
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        bmiCalculation();
    }
}
