class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();

       

        for(int i=0; i<candies.length; i++){

             int maxCandy = candies[0];
             for(int candy:candies){
                if(candy>maxCandy){
                    maxCandy= candy;
                }
             }

            if(candies[i]+ extraCandies >= maxCandy){

                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
        
    }
}