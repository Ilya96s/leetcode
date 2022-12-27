package ru.myLeetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers , every element appears twice except for one. Find that single one.nums
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 1
 *
 * Each element in the array appears twice except for one element which appears only once.
 *
 * @author Ilya Kaltygin
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        for (Integer integer : set) {
            result = integer;
        }
        return result;
    }
}
