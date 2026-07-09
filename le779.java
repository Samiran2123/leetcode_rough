public class le779 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int n = stones.length();
        int m = jewels.length();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }

        } 
        return count;
    }
}
