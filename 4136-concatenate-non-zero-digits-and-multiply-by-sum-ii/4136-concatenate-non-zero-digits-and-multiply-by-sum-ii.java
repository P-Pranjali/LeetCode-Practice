class Solution {

    private static final int MOD = 1_000_000_007;
    private static final int MAX = 100001;

    private static final long[] POW10 = new long[MAX];

    static{
        POW10[0] = 1;
        for(int i = 1; i < MAX; i++){
            POW10[i] = (POW10[i-1] * 10) % MOD;
        }
    }


    public int[] sumAndMultiply(String s, int[][] queries) {

      int n = s.length();

      int[] digitSum = new int[n+1];

      int[] nonZeroCount = new int[n + 1];

      long[] prefixNumber = new long[n +1];

      for(int i =1; i <= n; i++){
        int digit = s.charAt(i-1) - '0';

        digitSum[i] = digitSum[i - 1] + digit;

        nonZeroCount[i] = nonZeroCount[i - 1] + (digit > 0 ? 1 : 0);

        if(digit == 0){
            prefixNumber[i] = prefixNumber[i -1];
        }else{
            prefixNumber[i] = (prefixNumber[i - 1] * 10 + digit) % MOD;
        }
      }
        
        int[] answer = new int[ queries.length];

        for(int i = 0; i < queries.length; i++){

            int left = queries[i][0];
            int right = queries[i][1];

            int count = nonZeroCount[right + 1] - nonZeroCount[left];

            int sum = digitSum[right + 1] - digitSum[left];

            long x = (prefixNumber[right + 1]
                        - (prefixNumber[left] * POW10[count]) % MOD
                        + MOD) % MOD;

            answer[i] = (int) ((x * sum) % MOD);
        }

        return answer;
    }
}