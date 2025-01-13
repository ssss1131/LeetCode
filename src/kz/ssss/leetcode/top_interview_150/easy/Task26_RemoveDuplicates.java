package kz.ssss.leetcode.top_interview_150.easy;

import java.util.Scanner;

public class Task26_RemoveDuplicates {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = parseArray(scanner.nextLine());
        int k = removeDuplicates(nums);
        System.out.println(k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    private static int[] parseArray(String input) {
        input = input.trim().replaceAll("[\\[\\]\\s]", "");

        if (input.isEmpty()) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }


}
