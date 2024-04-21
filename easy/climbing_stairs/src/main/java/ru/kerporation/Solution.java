package ru.kerporation;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int climbStairs(final int n) {
        final Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    private int climbStairs(final int n,
                            final Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }



    public int climbStairsTimeLimitExceeded(final int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairsTimeLimitExceeded(n - 1) + climbStairsTimeLimitExceeded(n - 2);
    }
}