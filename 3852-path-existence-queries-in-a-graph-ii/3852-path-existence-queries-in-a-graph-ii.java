class Solution {
    public long sumAndMultiply(int n) {

        StringBuilder sb = new StringBuilder();


        for(char ch : String.valueOf(n).toCharArray()){
            if(ch != '0'){
                sb.append(ch);
            }
        }

        if(sb.length() == 0){
            return 0;
        }

        int x = Integer.parseInt(sb.toString());

        int sum = 0;

        for(char ch : sb.toString().toCharArray()){
            sum += ch - '0';
        }
        return (long)x * sum;
    }
}