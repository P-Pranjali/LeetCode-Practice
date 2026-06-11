class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder resultStr = new StringBuilder();

       int i=0, j=0;

        while(i<word1.length() && j<word2.length()){

            resultStr.append(word1.charAt(i));
            resultStr.append(word2.charAt(j));
            i++;
            j++;

        }

        while(i<word1.length()){
            resultStr.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length()){
            resultStr.append(word2.charAt(j));
            j++;
        }

        return resultStr.toString();
        
    }
}