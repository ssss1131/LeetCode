package kz.ssss.leetcode.top_interview_150.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task169_MajorityElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = parseArray(scanner.nextLine());
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> sums = new HashMap<>();
        int target = nums.length / 2;
        for (int num : nums) {
            sums.put(num, sums.getOrDefault(num, 0) + 1);
            if (sums.get(num) > target){
                return num;
            }
        }
        return 0;
    }

}
