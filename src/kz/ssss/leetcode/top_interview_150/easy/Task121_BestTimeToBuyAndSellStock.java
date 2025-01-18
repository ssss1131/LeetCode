package kz.ssss.leetcode.top_interview_150.easy;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int res = maxProfit(parseArray(line));
        System.out.println(res);

    }

    public static int maxProfit(int[] prices) {
        int min = 100000;
        int max = -1;
        int result = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
                max = -1;
            } else if (max < price) {
                max = price;
            }
            if (max - min > result) {
                result = max - min;
            }
        }
        return Math.max(result, 0);
    }

}
