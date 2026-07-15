class Solution {
    public int maxProfit(int[] prices) {

        int left = 0; int right = 1;
        int maxProfit = 0;

        while(left< prices.length && right < prices.length){

            if(prices[left] < prices[right]){

                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            
                right++;
            }else{

                left = right; 
                right++;
            }

        }
        return maxProfit;
    }
}

//  class Solution {
//     public int maxProfit(int[] prices) {

//         int minPrice = Integer.MAX_VALUE;

//         int maxProfit = 0;
//         for(int i = 0; i < prices.length; i++){

//             minPrice = Math.min(minPrice, prices[i]);

//             maxProfit = Math.max(maxProfit, prices[i] - minPrice );
//         }
//             return maxProfit;
//     }
//  }


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