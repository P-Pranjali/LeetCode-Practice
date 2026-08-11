class Solution {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int result = backtrack(coins, amount, dp);

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int backtrack(int[] coins, int amount, int[] dp) {

        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[amount] != -1) {
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {

            int result = backtrack(coins, amount - coin, dp);

            if (result != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + result);
            }
        }

        dp[amount] = min;

        return dp[amount];
    }
}

// class Solution {
//     int min = Integer.MAX_VALUE;

//     public int coinChange(int[] coins, int amount) {

//         if(amount == 0) return 0;

//        int result = backtrack(coins, amount);

//         return result == Integer.MAX_VALUE ? -1 : result;
        
//     }

//     private int backtrack(int[] coins, int amount) {

//         if (amount < 0)
//             return Integer.MAX_VALUE;

//         if (amount == 0)
//             return 0;
//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i < coins.length; i++) {

//             int result = backtrack(coins, amount - coins[i]);

//             if (result != Integer.MAX_VALUE) {
//                 min = Math.min(min, result + 1);
//             }

//         }

//         return min;
//     }
// }