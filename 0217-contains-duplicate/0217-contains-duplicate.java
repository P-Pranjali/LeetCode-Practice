class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< nums.length; i++){

            if(set.contains(nums[i])){  //checkin if current nums[i] value is present in hashMap 
                return true;       //If present return true
            }

            set.add(nums[i]);  //putting value and index in hashMap.
        }
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i< nums.length; i++){

//             if(map.containsKey(nums[i])){  //checkin if current nums[i] value is present in hashMap 
//                 return true;       //If present return true
//             }

//             map.put(nums[i], i);  //putting value and index in hashMap.
//         }
//         return false;
//     }
// }