package com.Chapter7;

public class Ch73 {

    public static float power(float x, int n) {
        int i = 0;
        float xpown = 1.0f;
        while (i < Math.abs(n)) {
            if (n > 0) {
                xpown *= x;
            } else {
                xpown /= x;
            }
            i++;
        }
        return xpown;
    }

    public static void main(String[] args) {
        float x = 2.0f;
        int n = 4;
        System.out.println(x + " raised to the power of " + n + " equals " + power(x, n));
    }
}