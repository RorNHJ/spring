package bmiCalculater;

/**
 * Created by hyun ji Ra on 2017-08-27.
 */
public class BMICalculater {
    private double lowWeight;
    private double normal;
    private double overWeight;
    private double obesity;

    public BMICalculater(double lowWeight, double normal, double overWeight) {
        this.lowWeight = lowWeight;
        this.normal = normal;
        this.overWeight = overWeight;
//        this.obesity = obesity;
    }


    public void bmiCalculation(double weight, double height){

        double h = height * 0.01;
        double result = weight/(h*h);

        System.out.println("BMI 지수 : " + (int)result);
        if(result>obesity){
            System.out.println("비만입니다");
        }else if(result>overWeight){
            System.out.println("과체중 입니다");
        }else if(result>normal){
            System.out.println("정상 입니다");
        }else{
            System.out.println("저체중 입니다");
        }

    }

    public void setLowWeight(double lowWeight) {
        this.lowWeight = lowWeight;
    }

    public void setNormal(double normal) {
        this.normal = normal;
    }

    public void setOverWeight(double overWeight) {
        this.overWeight = overWeight;
    }

    public void setObesity(double obesity) {
        this.obesity = obesity;
    }
}
