class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, 0, current, result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: what condition, and what do we do here?
        if ( index == nums.length ) {
            result.add(new ArrayList(current));
            return;
        }

        // Choice 1: include nums[index]
        current.add(nums[index]);
        backtrack(nums, index + 1, current, result);
        current.remove(current.size() - 1) ;  // undo

        // Choice 2: exclude nums[index]
        backtrack(nums, index + 1 , current, result);
    }
}