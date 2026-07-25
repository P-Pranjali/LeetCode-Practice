// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if(s.length() != t.length()) return false;

//         HashMap<Character, Integer> map = new HashMap<>();

//             for(int i = 0; i <s.length(); i++){

//                 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+ 1);
//             }
//             for(int j = 0; j < t.length(); j++){

//                 if(!map.containsKey(t.charAt(j)) || map.get(t.charAt(j)) == 0){
//                     return false;
//                  }

//                  map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
//             }
//                 return true;     
//     }
// }


class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) -'a']++;

        }
        for(int i = 0; i < t.length(); i++){
            if(freq[t.charAt(i)-'a'] == 0){
                return false;
            }
                freq[t.charAt(i) -'a']--;
            
        }
        return true;
    }
}