// class Solution {
//     public int maxVowels(String s, int k) {

//         int count = 0;

//         HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
//         // HashSet<Character> set = new HashSet<>();
//         // set.add('a');
//         // set.add('e');
//         // set.add('i');
//         // set.add('o');
//         // set.add('u');

//         for(int i = 0; i < k; i++){

//             if(set.contains(s.charAt(i))){
//                 count++;
//             }
//         }

//         int max = count;

//         for(int i = k; i < s.length(); i++){
//             if(set.contains(s.charAt(i))) count++;
//             if(set.contains(s.charAt(i - k))) count--;

//             max = Math.max(count, max);
//         }

//         return max;
//     }
// }



class Solution {

   static  boolean isVowel(char c){

    return (c=='a' || c =='e' || c== 'i' || c=='o' ||c =='u');

   }
    public int maxVowels(String s, int k) {
int count = 0;
int max = 0;

 int left = 0;

for (int right = 0; right < s.length(); right++) {

if (isVowel(s.charAt(right))) {
    count++;
}
    

    if (right-left + 1 > k) {

       if(isVowel(s.charAt(left))){
        count--;
       }
        left++;
    }

    if (right - left + 1 == k) {

        max = Math.max(max, count);
    }
}
return max;
    }
    
    }