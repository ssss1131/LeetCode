package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task274_HIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(hIndex(parseArray(line)));
    }

    public static int hIndex(int[] citations) {
        quickSort(citations, 0, citations.length - 1);
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            if(citations[i] > hIndex){
                hIndex++;
            }else {
                break;
            }
        }
        return hIndex;
    }

    private static void quickSort(int[] nums, int beg, int end) {
        if (end > beg) {
            int pivot = partition(nums, beg, end);
            quickSort(nums, beg, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private static int partition(int[] nums, int beg, int end) {
        int pivot = beg + (end - beg) / 2;
        swap(nums, pivot, end);
        int cur = beg;
        for (int i = cur; i < end; i++) {
            if(nums[end] < nums[i]){
                swap(nums, cur++, i);
            }
        }
        swap(nums, cur, end);
        return cur;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
