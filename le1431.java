public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> ans = new ArrayList<>(candies.length);
         int MAX = 0;
         for(int i = 0; i < candies.length; i++){
           if(candies[i] > MAX){
            MAX = candies[i];
           }
         }
         for(int i = 0; i < candies.length;i++){
            ans.add(candies[i]+extraCandies >= MAX);
         }
         return ans;
    }
}