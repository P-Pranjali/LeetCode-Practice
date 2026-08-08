class Solution {
            List<String> result = new ArrayList<>();
            StringBuilder current = new StringBuilder();
            String[] map = {
    "",     
    "",     
    "abc",  
    "def",  
    "ghi",  
    "jkl",  
    "mno",  
    "pqrs", 
    "tuv",  
    "wxyz"  
};

    public List<String> letterCombinations(String digits) {

        backtrack(0, digits);
        return result;
        
    }

    private void backtrack(int index, String digits){
    
        if(index == digits.length()){

            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++){
        current.append(letters.charAt(i));

        backtrack(index + 1, digits);

        current.deleteCharAt(current.length() - 1);
    }
}
}