package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task55_JumpGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(canJump(parseArray(line)));
    }

    public static boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > max){
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }

}
