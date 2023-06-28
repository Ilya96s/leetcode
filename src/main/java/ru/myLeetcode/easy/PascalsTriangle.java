package ru.myLeetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 *
 *
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 *
 *
 * Constraints:
 *
 * 1 <= numRows <= 30
 *
 * @author Ilya Kaltygin
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0) {
            return lists;
        }

        lists.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevList = lists.get(i - 1);
            List<Integer> currentList = new ArrayList<>();

            currentList.add(1);

            for (int j = 1; j < i; j++) {
                currentList.add(prevList.get(j - 1) + prevList.get(j));
            }

            currentList.add(1);

            lists.add(currentList);
        }
        return lists;
    }
}
