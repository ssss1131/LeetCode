package kz.ssss.leetcode.top_interview_150.easy;

import java.util.Scanner;

public class Task27_RemoveElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = parseArray(scanner.nextLine());
        int val = scanner.nextInt();
        int k = removeElement(nums, val);
        System.out.println(k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
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
