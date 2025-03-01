class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
        }
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
        }
        return nums;
    }
}