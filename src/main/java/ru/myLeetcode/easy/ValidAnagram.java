package ru.myLeetcode.easy;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * @author Ilya Kaltygin
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != ct[i]) {
                return false;
            }
        }
        return true;
}
