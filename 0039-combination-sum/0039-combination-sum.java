class Solution {
     List<List<Integer>> result = new ArrayList<>();
         List<Integer> current = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(0, target, candidates);
        return result;
    }

    private void backtrack(int index, int remaining, int[] candidates){

        if(remaining == 0){
            result.add(new ArrayList(current));
            return;
        }
        if(remaining < 0) return;

        for(int i = index; i < candidates.length; i++ ){
            current.add(candidates[i]);
            backtrack(i, remaining - candidates[i], candidates);
            current.remove(current.size()- 1);
        }
    }
}

// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> result = new ArrayList<>();
//         List<Integer> current = new ArrayList<>();
//         backtrack(candidates, target, 0, 0, current, result);
//         return result;
//     }

//     private void backtrack(int[] candidates, int target, int index, int sum, List<Integer> current, List<List<Integer>> result) {

//         if(sum == target){
//              result.add(new ArrayList(current));
//              return;
            
//         }

//            if(sum > target){
//             return;
//         }

//         if(index == candidates.length && sum != target) return;

//         current.add(candidates[index]);

//         backtrack(candidates, target, index , sum + candidates[index], current, result);

//         current.remove((current.size()) - 1);

//        backtrack(candidates, target, index + 1, sum, current, result);
  
//     }
// }