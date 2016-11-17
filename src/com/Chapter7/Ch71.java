package com.Chapter7;

import java.util.Scanner;

public class Ch71 {

    public static void main(String[] args) {
        loop(10);
    }

    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }
}

/*
Variable table
 _n___i_
| 10| 5 |
| 5 | 6 |
| 6 | 3 |
| 3 | 4 |
| 4 | 2 |
| 2 | 1 |
 ¯¯¯¯¯¯¯
 */