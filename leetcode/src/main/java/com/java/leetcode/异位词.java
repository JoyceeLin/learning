
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/5/18 16:51
 * @Version V1.0
 */
public class 异位词 {

    public static void main(String[] args) {
        System.out.println(isAnagram("aaa", "bbb"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] cc = new char[26];
        char[] charArray = s.toCharArray();
        for (char aCharArray : charArray) {
            cc[aCharArray - 97] += 1;
        }
        for (char aCharArray : t.toCharArray()) {
            cc[aCharArray - 97] -= 1;
        }
        for (char aCc : cc) {
            if (aCc != 0) {
                return false;
            }
        }
        return true;
    }
}
