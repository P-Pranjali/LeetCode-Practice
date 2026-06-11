class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
            if(x==0){
            return true;
        }


        if(x%10==0){
            return false;
        }

        if(x<10 && x>=0){
            return true;
        }

    
        int reverse = 0;
        int temp = x;
    
        while(temp>0){

         reverse = reverse*10 + temp % 10;
            temp=temp/10;
        }

        return x==reverse;
        
    }
}