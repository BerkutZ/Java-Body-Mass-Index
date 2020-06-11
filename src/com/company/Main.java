package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input your mass ");
        int mass = num.nextInt();
        System.out.print("Input your height ");
        int height = num.nextInt();
        BmiService service = new BmiService();
        double index = service.getBodyMassIndex(mass, height);
        float result = (float) Math.round(index);
        System.out.print("Your BMI equals " + result + " kg/m2");

    }
}
