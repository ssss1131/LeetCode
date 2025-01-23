package kz.ssss.leetcode.top_interview_150.medium;

import java.util.Scanner;

import static kz.ssss.leetcode.top_interview_150.medium.Task80_RemoveDuplicates.parseArray;

public class Task134_GasStation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gas = scanner.nextLine();
        String cost = scanner.nextLine();
        System.out.println(canCompleteCircuit(parseArray(gas), parseArray(cost)));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            totalTank += gas[i] - cost[i];
            currentTank += gas[i] - cost[i];

            if (currentTank < 0) {
                startIndex = i + 1;
                currentTank = 0;
            }
        }
        return totalTank >= 0 ? startIndex : -1;

    }

}
