package com.company;

import java.util.Scanner;

public class BmiService {
    public double BodyMassIndex(double mass, double height) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input your mass ");
        mass = num.nextInt();
        System.out.print("Input your height ");
        height = num.nextInt();
        double index = Math.pow(mass, 2) / height;
        return index;
    }


}
