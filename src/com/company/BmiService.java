package com.company;

public class BmiService {
    public double getBodyMassIndex(double mass, double height) {
        double index = Math.pow(mass, 2) / height;
        return index;
    }


}
