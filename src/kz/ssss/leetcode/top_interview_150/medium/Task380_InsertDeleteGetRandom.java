package kz.ssss.leetcode.top_interview_150.medium;

import java.util.*;

public class Task380_InsertDeleteGetRandom {

    static class RandomizedSet {

        private Map<Integer, Integer> map;
        private List<Integer> integers;
        private Random random;

        public RandomizedSet() {
            map = new HashMap<>();
            integers = new ArrayList<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            map.put(val, integers.size());
            integers.add(val);
            return true;
        }

        public boolean remove(int val) {
            Integer index = map.get(val);
            if (index == null) {
                return false;
            }
            Integer last = integers.get(integers.size() - 1);
            integers.set(index ,last);
            map.put(last, index);
            integers.remove(integers.size() - 1);
            map.remove(val);
            return true;

        }

        public int getRandom() {
            return integers.get(random.nextInt(integers.size()));
        }
    }


    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

        System.out.println(randomizedSet.remove(0));
        System.out.println(randomizedSet.remove(0));

        System.out.println(randomizedSet.insert(0));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(0));
        System.out.println(randomizedSet.insert(0));

    }

}
