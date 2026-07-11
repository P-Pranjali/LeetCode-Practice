 class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){

            minPrice = Math.min(minPrice, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - minPrice );
        }
            return maxProfit;
    }
 }


// class Solution {
//     public int maxProfit(int[] prices) {

//         int maxProfit = 0;

//         for(int i = 0; i < prices.length; i++){

//             for(int j = i+1; j< prices.length; j++){

//                 if(prices[j] - prices[i] >= maxProfit){

//                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
//                 }
//             }
//         }
//         return maxProfit;
//     }
// }