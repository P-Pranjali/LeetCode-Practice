class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;

        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        // HashSet<Character> set = new HashSet<>();
        // set.add('a');
        // set.add('e');
        // set.add('i');
        // set.add('o');
        // set.add('u');

        for(int i = 0; i < k; i++){

            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        
        int max = count;

        for(int i = k; i < s.length(); i++){
            if(set.contains(s.charAt(i))) count++;
            if(set.contains(s.charAt(i - k))) count--;

            max = Math.max(count, max);
        }

        return max;
    }
}