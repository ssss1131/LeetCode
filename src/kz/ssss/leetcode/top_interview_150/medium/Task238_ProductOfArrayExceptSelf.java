package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Arrays;
import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task238_ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] res = productExceptSelf(parseArray(line));
        for (int re : res) {
            System.out.println(re + " ");
        }
    }


    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int zeroCount = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                return new int[nums.length];
            } else if (zeroCount == 1) {
                result[i] = nums[i] == 0 ? product : 0;
            } else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }

}
