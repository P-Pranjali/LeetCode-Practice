class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

        String key = new String(ch);

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
    //   HashMap<String, List<String>> map = new HashMap<>();
    //   for(String str : strs){
    //     int[] count = new int[26];
    //     for(char c : str.toCharArray()){

    //         count[c-'a']++;
    //     }

    //     String key = Arrays.toString(count);

    //     map.computeIfAbsent(key, k-> new ArrayList<>());
    //         map.get(key).add(str);

    //   }
    //         return new ArrayList<>(map.values());
    //}
    //}