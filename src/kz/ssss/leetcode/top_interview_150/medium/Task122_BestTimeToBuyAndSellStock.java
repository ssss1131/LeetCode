package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task122_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int res = maxProfit(parseArray(line));
        System.out.println(res);
    }

    public static int maxProfit(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] - nums[i] > 0){
                result+= nums[i + 1] - nums[i];
            }
        }
        return result;
    }

}
