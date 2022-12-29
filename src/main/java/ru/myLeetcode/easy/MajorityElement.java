package ru.myLeetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority elementalways exists in the array.
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * @author Ilya Kaltygin
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int maxValue = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > maxValue) {
                maxValue = i.getValue();
                result = i.getKey();
            }
        }
        return result;
    }
}
