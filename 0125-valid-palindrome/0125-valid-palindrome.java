class Solution {
    public boolean isPalindrome(String s) {

        if(s.equals(" ")) return true;

        String str = s.toLowerCase();

        int left = 0; 
        int right = str.length() - 1;

        while(left < right){

        while(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;}

 while(left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;}
            
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else{
         return false;
        }}
        return true;
    }
}