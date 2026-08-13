class Solution {

    //   Srting open = "(";
    //     String close = ")";

    List<String> result = new ArrayList<>();
    StringBuilder current = new StringBuilder();


    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return result;
        
    }

    private void backtrack(int open, int close, int n){

        if(open == n && close == n){
            result.add(current.toString());
            return;
        }

        if(open < n){
            current.append("(");
        backtrack(open + 1, close, n);
        current.deleteCharAt(current.length() -1);
        }

        if(close < open){
            current.append(")");
            backtrack(open, close + 1, n);
            current.deleteCharAt(current.length() - 1);
        }

    }
}