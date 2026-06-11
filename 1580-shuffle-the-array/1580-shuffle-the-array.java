class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int ans[]=new int[n*2];
        int index=0;
        for(int i=0;i<n;i++){
           
            ans[index++]=nums[i];
            
            ans[index++]=nums[i+n];
        }

        return ans;
        
    }

    public static void main(String[] args){
        Solution s= new Solution();

        int ans[]= s.shuffle(new int[]{2,5,1,3,4,7}, 3);

        //System.out.println(Array.toString(ans));
        System.out.println(Arrays.toString(ans));
    }
}