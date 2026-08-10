class Solution {

    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return robHouse(nums, nums.length - 1, dp);
    }

    private int robHouse(int[] nums, int i, int[] dp) {

        if (i < 0) {
            return 0;
        }

        if (i == 0) {
            return nums[0];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = nums[i] + robHouse(nums, i - 2, dp);

        int skip = robHouse(nums, i - 1, dp);

        dp[i] = Math.max(rob, skip);

        return dp[i];
    }
}

// class Solution {

//     public int rob(int[] nums) {
//         return robHouse(nums, nums.length - 1);
//     }

//     private int robHouse(int[] nums, int i) {

//         if (i < 0) {
//             return 0;
//         }

//         if (i == 0) {
//             return nums[0];
//         }

//         int rob = nums[i] + robHouse(nums, i - 2);

//         int skip = robHouse(nums, i - 1);

//         return Math.max(rob, skip);
//     }
// }