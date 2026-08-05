class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

           if( x / mid > mid){
            left = mid + 1;
            ans = mid;
           }else if(x /  mid  < mid){
            right = mid - 1;
           }else{
            return mid;
           }

        }

        return ans;
    }
}