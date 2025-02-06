package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Arrays;
import java.util.Scanner;

public class Task151_ReverseWordsInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverseWords(scanner.nextLine().replaceAll("\"", "")));
    }

    public static String reverseWords(String s) {
        String[] words = Arrays.stream(s.split(" "))
                .map(String::trim)
                .filter(word -> !word.isEmpty())
                .toArray(String[]::new);

        return reverseArray(words);
    }

    private static String reverseArray(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }
}
