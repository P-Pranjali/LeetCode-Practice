class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

       HashMap<Integer, Integer>  map = new HashMap<>();

       for(int i = 0; i <nums.length; i++){
        int secondNumber = target - nums[i];

        if(map.containsKey(secondNumber)){

            answer[0] = i;
            answer[1] = map.get(secondNumber);
        }
        map.put(nums[i], i);


       }
        return answer;
    }
}

