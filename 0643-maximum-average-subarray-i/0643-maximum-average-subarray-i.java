class Solution{
    public double findMaxAverage(int[] nums, int k){

        int left = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int right = 0; right < nums.length; right++){
            currentSum +=nums[right];

            if((right -left)+ 1 >k){
                currentSum -= nums[left];
                left++;

            }
             if((right - left) + 1 == k){
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return (double) maxSum/k;
    }
}

// class Solution {
//     public double findMaxAverage(int[] nums, int k) {

        
//         double currentSum = 0;

//         for(int i = 0; i< k; i++){

//             currentSum += nums[i];

//         }
//         double maxSum = currentSum;
//         for(int i = k; i< nums.length; i++){

//             currentSum += nums[i] - nums[i-k];
//             maxSum = Math.max(maxSum, currentSum);
//         }   
//         return maxSum/k;    
//     }
// }