package com.agam.algorithm.core;

/**
 * 最大回文数
 */
public class LongestPalindrome {
    public static void main(String[] args) {

        //动态规划法
        System.out.println("====");

        //添加辅助标志
        System.out.println("===");

        //中心检测法
        System.out.println(longestPalindrome("abbac"));
    }

    /**
     * 中心检测法
     * 时间复杂度：O(n2)
     * @param str
     * @return
     */
    public static String longestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        String longest = str.substring(0,1);

        for (int i = 0; i < str.length(); i++) {
            String s = getPalindrome(str, i, i);
            if(s.length()> longest.length()){
                longest = s;
            }

            s = getPalindrome(str, i, i + 1);

            if(s.length()> longest.length()){
                longest = s;
            }
        }
        return longest;
    }

    private static String getPalindrome(String str, int i, int j) {
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }
        return str.substring(i + 1, j);
    }
}
