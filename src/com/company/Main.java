package com.company;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 0, height = 0;
        double index = service.BodyMassIndex(mass, height);
        float result = (float)Math.round(index);
        System.out.print("Your BMI equals " + result + " kg/m2");

    }
}
