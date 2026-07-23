class Solution {

   
    public int climbStairs(int n) {

        if(n == 1) return 1;
        return steps(n) ;
    }

    private int steps(int n){

        int[] dp = new int[n +1];

        dp[1] = 1;
        dp[2] = 2;

    for(int i = 3; i <= n; i++){

        dp[i] = dp[i - 1] + dp[i - 2];
       
    }
    return  dp[n];
}
}

// class Solution {

   
//     public int climbStairs(int n) {
//         return steps(n) ;
//     }

//     private int steps(int n){

//         if(n == 1) return 1;
//         if(n == 2) return 2;

//        return  steps(n - 1) + steps(n - 2);
//     }
// }