class Solution {
    public boolean increasingTriplet(int[] nums) {

        int num1 = Integer.MAX_VALUE;  //smallest no. seen so far

        int num2 = Integer.MAX_VALUE;  //second Smallest NO. seen so far

        for(int num : nums){   //and num (current NO) is our third no.

        if(num <= num1){   //if current no smaller than our smallest no. 

                num1= num;  //make this current no as our smallest no.
            }else if(num <= num2){ //else if current No. smaller than our second smallest NO. (This ensures  num1 is already < num )

                num2= num;  //make this current No as our second smallest NO.
            }else{
             return true;  //If num is neither < num1 nor num 2 means num1 & num2 are < num, so we found triplet as num1<num2<num
            }
        }
       
        return false;
    }
}