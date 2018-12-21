package leeCode;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Solution {

    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        } else if (n == Integer.MAX_VALUE) {
            return 2 + integerReplacement((n >> 1) + 1);
        }
        if ((n & 1) == 0) {
            //偶数
            return integerReplacement(n >> 1) + 1;
        } else {
            //奇数
            return Math.min(integerReplacement(n + 1), integerReplacement(n - 1)) + 1;
        }
    }

    public int integerReplacement2(int n) {
        if (n == 1) {
            return 0;
        } else if (n == Integer.MAX_VALUE) {
            return 2 + integerReplacement2((n >> 1) + 1);
        }
        if ((n & 1) == 0) {
            //偶数
            return integerReplacement2(n >> 1) + 1;
        } else {
            //奇数
            return munTrailingOnes(n) ? integerReplacement2(n + 1) + 1 : integerReplacement2(n - 1) + 1;
        }
    }

    //打掉二进制最后一位1 然后判断第二位是否为1
    private boolean munTrailingOnes(int num) {
        return ((num & (num - 1)) >> 1) == 1;
    }


    public int integerReplacement3(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i / 2] + 1;
            } else {
                if (i == Integer.MAX_VALUE) {
                    dp[i] = 2 + dp[i / 2 + 1];
                } else {
                    dp[i] = Math.min(dp[i - 1], dp[(i + 1) / 2] + 1) + 1;
                }
            }
        }
        return dp[n];
    }


    public int findSubstringInWraproundString(String p) {
        int[] pSize = new int[p.length()];
        int[] count = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pSize[i] = (int) (p.charAt(i) - 'a');
        }
        int num = 0;
        int sum = 0;
        for (int i = 0; i < pSize.length; i++) {
            if (i > 0 && (pSize[i - 1] + 1) % 26 == pSize[i]) {
                num++;
            } else {
                num = 1;
            }
            count[pSize[i]] = Math.max(count[pSize[i]], num);
        }
        for (int i = 0; i < 26; i++) {
            sum = sum + count[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerReplacement2(3));
    }
}

