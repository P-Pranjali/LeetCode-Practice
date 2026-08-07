class Solution {

List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums);
        return result;   
    }

    private void backtrack(int index, int[] nums){

        if(index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        backtrack(index + 1, nums);

        current.remove(current.size() - 1);

        backtrack(index + 1, nums); 
    }
}

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         List<Integer> current = new ArrayList<>();
//         backtrack(nums, 0, current, result);
//         return result;
//     }

//     private void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
//         // Base case: what condition, and what do we do here?
//         if ( index == nums.length ) {
//             result.add(new ArrayList(current));
//             return;
//         }

//         // Choice 1: include nums[index]
//         current.add(nums[index]);
//         backtrack(nums, index + 1, current, result);
//         current.remove(current.size() - 1) ;  // undo

//         // Choice 2: exclude nums[index]
//         backtrack(nums, index + 1 , current, result);
//     }
// }