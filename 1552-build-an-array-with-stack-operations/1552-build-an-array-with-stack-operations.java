class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        
        List<String> list = new ArrayList<>();

        int index=0;

        for(int i=1;i<=n;i++){

            list.add("Push");

            if(index<target.length && i==target[index]){
                index++;
            }
            else{
                list.add("Pop");
            }


            if(index==target.length){
                break;
            }
        }
        return list;
    }
}