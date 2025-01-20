package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task45_JumpGame2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(jump(parseArray(line)));
    }

    public static int jump(int[] nums) {
        int n, f, j;
        n = f = j = 0;
        int max = -1;
        while (f < nums.length - 1) {
            for (int i = n; i <= f; i++) {
                if(nums[i] + i > max){
                    max = nums[i] + i;
                }
            }
            n = f + 1;
            f = max;
            max = -1;
            j++;
        }
        return j;
    }

}
