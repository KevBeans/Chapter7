package com.Chapter7;

public class Ch72 {

    public static double squareRoot(double a) {
        double x0 = 0;
        double x1 = a / 2;
        while (Math.abs(x1 - x0) > 0.0001) {
            x0 = x1;
            x1 = (x0 + a / x0) / 2;
        }
        return x1;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(49));
        System.out.println(squareRoot(100));
    }
}