class Solution {
    public int[] findErrorNums(int[] nums) {
        
          Arrays.sort(nums);
        int duplicate=-1;
        int actualSum=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) {
                duplicate = nums[i];
            }
            actualSum+=nums[i];
        }

        int n=nums.length;
        int expectedSum = n*(n+1)/2;
        int missingNo = expectedSum-(actualSum-duplicate);

        // Edge case: missing number is at the start or end
        if (nums[0] != 1) {
            missingNo = 1;
        } else if (nums[nums.length - 1] != nums.length) {
            missingNo = nums.length;
        }
        return new int[]{duplicate, missingNo};
    }
}