class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxCount=Math.max(maxCount, count);
            }else
            {
                count=0;
            }
        }
        return maxCount;
        
    }

    public static void main (String[] args){
        Solution s = new Solution();
        int ans = s.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        System.out.println(ans);
    }
}