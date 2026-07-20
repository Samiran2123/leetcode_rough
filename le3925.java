class le3925 {
    public int[] concatWithReverse(int[] nums) {

        int[] arr = new int[nums.length * 2];

       
        int numslast = nums.length - 1;
        int arrlast = nums.length;

        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
            arr[arrlast] = nums[numslast];

            arrlast++;
            numslast--;

        }

        return arr;

        
        
    }
}