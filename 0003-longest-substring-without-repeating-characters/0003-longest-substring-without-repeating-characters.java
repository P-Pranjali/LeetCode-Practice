
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);

            maxLen = Math.max(maxLen, right-left + 1);
        }
        
        return maxLen;
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//         HashSet<Character> set = new HashSet<>();

//         int left =0; int right = 0;
//         int maxLength=0;

//         while(right<s.length()){

//             if(!set.contains(s.charAt(right))){
//                 set.add(s.charAt(right));
//             maxLength =  Math.max(maxLength, right-left+1);
//             right++;
//             }else{
//             set.remove(s.charAt(left));
//             left++;
//             }
//         }
          
//         return maxLength;
//     }
    
// }
