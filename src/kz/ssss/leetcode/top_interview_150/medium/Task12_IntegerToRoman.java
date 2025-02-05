package kz.ssss.leetcode.top_interview_150.medium;

import java.util.*;

public class Task12_IntegerToRoman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(intToRoman(scanner.nextInt()));
    }

    private static final int[] values = {
            1000,
            900,
            500,
            400,
            100,
            90,
            50,
            40,
            10,
            9,
            5,
            4,
            1
    };

    private static final String[] romans = {
            "M",
            "CM",
            "D",
            "CD",
            "C",
            "XC",
            "L",
            "XL",
            "X",
            "IX",
            "V",
            "IV",
            "I"
    };


    public static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]){
                roman.append(romans[i]);
                num-=values[i];
            }
        }
        return roman.toString();

    }

}
