package ru.myLeetcode.easy;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
 *
 * Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
 *
 *
 *
 * Example 1:
 *
 * Input: salary = [4000,3000,1000,2000]
 * Output: 2500.00000
 * Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
 * Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
 * Example 2:
 *
 * Input: salary = [1000,2000,3000]
 * Output: 2000.00000
 * Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
 * Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
 *
 *
 * Constraints:
 *
 * 3 <= salary.length <= 100
 * 1000 <= salary[i] <= 106
 * All the integers of salary are unique.
 *
 * @author Ilya Kaltygin
 */
public class AverageSalary {
    public double average(int[] salary) {
        int sum = 0;
        int count = 0;
        SortedSet<Integer> ss = new TreeSet<>();
        for (Integer i : salary) {
            ss.add(i);
        }

        ss.remove(ss.first());
        ss.remove(ss.last());

        Iterator it = ss.iterator();

        while (it.hasNext()) {
            sum += (int) it.next();
            count++;
        }
        return (double) sum / count;
    }
}
