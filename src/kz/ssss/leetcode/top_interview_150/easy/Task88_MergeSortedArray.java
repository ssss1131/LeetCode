package kz.ssss.leetcode.top_interview_150.easy;

import java.util.Scanner;

public class Task88_MergeSortedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums1Input = scanner.nextLine();
        int m = scanner.nextInt();
        scanner.nextLine();
        String nums2Input = scanner.nextLine();
        int n = scanner.nextInt();

        int[] nums1 = parseArray(nums1Input);
        int[] nums2 = parseArray(nums2Input);
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j>=0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                nums1[i] = nums2[j];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
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
