class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int pos=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                for(int j=i;j>0;j--){
                    if(nums[j]<nums[j-1]){
                        int temp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                    }

                }
            }
        }
    }
}