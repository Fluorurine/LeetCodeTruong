package com.arrayandhash;

import java.util.HashMap;

public class ArrayAndHashSolution {
    // Leetcode 217 Solution - Easy
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }

        }
        return false;
    }

    public String helloMsg() {
        return "Hello From Array";
    }
}
