class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for(int num : nums){

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                pq.add(new int[]{entry.getKey(), entry.getValue()});

                if(pq.size() > k){
                    pq.poll();
                }
        }
        int[] result = new int[k];
            int i = 0;
        
        for(int[] entry : pq ){

            result[i++] = entry[0];
        }
        return result;
    }
}