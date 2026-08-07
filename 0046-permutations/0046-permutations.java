class Solution {

    List<List<Integer>> result = new ArrayList<>();

    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        boolean[] used = new boolean[nums.length];

        backtrack(used, nums);
        return result;

    }

    private void backtrack(boolean[] used, int[] nums) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {

            if (used[i])
                continue;

            current.add(nums[i]);
            used[i] = true;

            backtrack(used, nums);

            current.remove(current.size() - 1);
            used[i] = false;

        }
    }
}