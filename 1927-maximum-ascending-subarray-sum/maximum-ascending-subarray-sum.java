class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = 0;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
     
            if (i == 0 || nums[i] > nums[i - 1]) {
                currentSum += nums[i]; 
            } else {
                currentSum = nums[i];
            }
            ans = Math.max(ans, currentSum);
        }
        
        return ans;
    }
}
