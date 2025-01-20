package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task275_HIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(hIndex(parseArray(line)));
    }

    public static int hIndex(int[] citations) {
        int hIndex = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > hIndex) {
                hIndex++;
            } else {
                break;
            }
        }
        return hIndex;
    }


}
