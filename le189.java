import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
int[] neArr = Arrays.copyOfRange(nums, n - k, n); 
 for (int i = n - k - 1; i >= 0; i--) {
    nums[i + k] = nums[i];
        } 
for (int i = 0; i < k; i++) {
            nums[i] = neArr[i];
        } 
    }
}
    




















//Brute Force Approach
        // int n = nums.length; 
        // k = k % n;
        //  for(int i = 0; i < k; i++){
        //      for(int j = n - 1; j > 0; j--){ 
        //  int temp = nums[j];
        //   nums[j] = nums[j - 1]; 
        //   nums[j - 1] = temp; 
        //   }
        //    }
    




















//Brute Force Approach
        // int n = nums.length; 
        // k = k % n;
        //  for(int i = 0; i < k; i++){
        //      for(int j = n - 1; j > 0; j--){ 
        //  int temp = nums[j];
        //   nums[j] = nums[j - 1]; 
        //   nums[j - 1] = temp; 
        //   }
        //    }