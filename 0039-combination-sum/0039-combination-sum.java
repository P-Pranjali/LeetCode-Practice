class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(candidates, target, 0, 0, current, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index, int sum, List<Integer> current, List<List<Integer>> result) {

        if(sum == target){
             result.add(new ArrayList(current));
             return;
            
        }

           if(sum > target){
            return;
        }

        if(index == candidates.length && sum != target) return;

        current.add(candidates[index]);

        backtrack(candidates, target, index , sum + candidates[index], current, result);

        current.remove((current.size()) - 1);

       backtrack(candidates, target, index + 1, sum, current, result);
  
    }
}