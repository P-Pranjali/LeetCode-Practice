class Solution {


    public int[] getConcatenation(int[] nums) {

        int n=nums.length;
        int ans[]= new int[n*2];

        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }

        return ans;
        
    }

    public static void main(String [] args){
        Solution s = new Solution();

       int ans[] = s.getConcatenation(new int[]{1,2,1});

       System.out.println(Arrays.toString(ans));

    }
}