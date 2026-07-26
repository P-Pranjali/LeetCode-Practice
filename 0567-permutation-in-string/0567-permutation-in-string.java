class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length()) return false;

        int[] mapS1 = new int[26];
        int[] mapS2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            mapS1[s1.charAt(i) - 'a']++;
            mapS2[s2.charAt(i) - 'a']++;

        }
        if(isMatched(mapS1, mapS2)) return true;

        for(int i = 1; i <= s2.length() - s1.length(); i++){
            mapS2[s2.charAt(i-1) - 'a']--;
            mapS2[(s2.charAt(i + s1.length() - 1) - 'a')]++;

            if(isMatched(mapS1, mapS2)) return true;

            }
        
        return false;
}

        private boolean isMatched(int[] map1, int[] map2){
            for(int i = 0; i < 26; i++){

            if(map1[i] != map2[i]) return false;
        }
        return true;
        }
}