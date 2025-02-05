package kz.ssss.leetcode.top_interview_150.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Task58_LengthOfLastWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lengthOfLastWord(scanner.nextLine()));
    }

    public static int lengthOfLastWord(String s) {
        int res = 0;
        boolean isWord = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' '){
                if(isWord){
                    break;
                }
                continue;
            }
            isWord = true;
            res++;
        }
        return res;
    }

}
