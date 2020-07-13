
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/6 15:34
 * @Version V1.0
 */
public class 字符串转换整数 {

    public static int myAtoi(String str2) {
        if (str2 == null || str2.length() == 0) {
            return 0;
        }
        if (str2.charAt(0) != '-' && str2.charAt(0) != '+' && (str2.charAt(0) < '0' || str2.charAt(0) > '9') && str2.charAt(0) != ' ') {
            return 0;
        }
        int firstIndex = 0;
        StringBuilder sb = new StringBuilder();
        boolean has = false;
        boolean hasElement = false;
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str2.charAt(i) != '-'
                    && str2.charAt(i) != '+'
                    && (str2.charAt(i) < '0' || str2.charAt(i) > '9')
                    && str2.charAt(i) != ' ') {
                break;
            }
            if (str2.charAt(i) == '+' || str2.charAt(i) == '-') {
                if (has || hasElement) {
                    break;
                }
                has = true;
                firstIndex = i;
            }
            if ((str2.charAt(i) == '-' && sb.length() != 0)
                    || (sb.length() > 0 && (sb.charAt(0) == '-' || sb.charAt(0) == '+') && (str2.charAt(i) == '-' || str2.charAt(i) == '+'))
                    || (str2.charAt(i) == ' ' && sb.length() > 0)
                    || (str2.charAt(i) == ' ' && firstIndex > 0)) {
                break;
            }
            if (str2.charAt(i) == '0' && (sb.length() == 0 || (sb.length() == 1 && str2.charAt(0) == '-'))) {
                firstIndex++;
                hasElement = true;
                continue;
            }
            if ((sb.length() == 0 && str2.charAt(i) == '-') || (str2.charAt(i) >= '0' && str2.charAt(i) <= '9')) {
                if ((firstIndex != 0 && (str2.charAt(i) < '0' || str2.charAt(i) > '9') && (firstIndex + 1 != i && firstIndex != i))
                        || (firstIndex + 1 == i && (str2.charAt(i) == '-' || str2.charAt(i) == '+'))) {
                    break;
                }
                sb.append(c);
                firstIndex = i;
                hasElement = true;
            } else if (str2.charAt(i) == ' ' || (str2.charAt(i) == '+' && sb.length() == 0)) {
                continue;
            } else {
                break;
            }
        }
        String min = String.valueOf(Integer.MIN_VALUE);
        String max = String.valueOf(Integer.MAX_VALUE);
        if (sb.length() <= 0 || (sb.charAt(0) == '-' && sb.length() == 1) || (sb.charAt(0) == '+' && sb.length() == 1)) {
            return 0;
        }
        if (sb.charAt(0) == '-') {
            if (sb.length() > min.length()) {
                return Integer.MIN_VALUE;
            } else if (sb.length() < min.length()) {
                return Integer.valueOf(sb.toString());
            } else {
                for (int i = 1; i < sb.length(); i++) {
                    if (sb.charAt(i) > min.charAt(i)) {
                        return Integer.MIN_VALUE;
                    } else if (sb.charAt(i) == min.charAt(i)) {
                        continue;
                    } else {
                        return Integer.valueOf(sb.toString());
                    }
                }
                return Integer.valueOf(sb.toString());
            }
        } else {
            if (sb.length() > max.length()) {
                return Integer.MAX_VALUE;
            } else if (sb.length() < max.length()) {
                return Integer.valueOf(sb.toString());
            } else {
                for (int i = 0; i < sb.length(); i++) {
                    if (sb.charAt(i) > max.charAt(i)) {
                        return Integer.MAX_VALUE;
                    } else if (sb.charAt(i) == max.charAt(i)) {
                        continue;
                    } else {
                        return Integer.valueOf(sb.toString());
                    }
                }
                return Integer.valueOf(sb.toString());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483649"));
    }
}
