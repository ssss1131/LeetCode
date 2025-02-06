package kz.ssss.leetcode.top_interview_150.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Task14_LongestCommonPrefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(longestCommonPrefix(parseStringArray(scanner.nextLine())));
    }

    public static String longestCommonPrefix(String[] strs) {
        int minLength = Arrays.stream(strs)
                .mapToInt(String::length)
                .min()
                .orElse(0);

        if(strs.length == 1){
            return strs[0];
        }
        int i = 0;
        for (; i < minLength; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(c != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
    }

    public static String[] parseStringArray(String input) {
        return input.replaceAll("[\\[\\]\"]", "")
                .split(",\\s*");
    }




}
