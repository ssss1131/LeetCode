package kz.ssss.leetcode.top_interview_150.easy;

import java.util.Map;
import java.util.Scanner;

public class Task13_RomanToInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(romanToInt(scanner.nextLine()));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romanToNumber = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int sum = 0;
        int prevNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer num = romanToNumber.get(c);
            if(prevNum < num){
                sum -= prevNum * 2;
            }
            sum+= num;
            prevNum = num;
        }
        return sum;
    }

}
