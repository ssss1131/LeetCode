package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task189_RotateArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = parseArray(scanner.nextLine());
        int k = scanner.nextInt();
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        int count = 0;
        int start = 0;

        while (count < length) {
            int current = start;
            int temp = nums[start];

            do {
                int nextIndex = (current + k) % length;
                int nextTemp = nums[nextIndex];
                nums[nextIndex] = temp;
                temp = nextTemp;

                current = nextIndex;
                count++;
            } while (current != start);

            start++;
        }
    }


}
