package com.Chapter7;

public class Ch74 {

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        System.out.println("The factorial of " + n + " is " + result);
        return result;
    }

    public static void main(String[] args) {

        factorial(10);
    }
}

//CONVERT FROM RECURSIVE TO ITERATIVE