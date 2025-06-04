class Solution {
    public int singleNumber(int[] nums) {
        // int n=nums.length;
        // int pos=0;
        // if(n==1){
        //     return nums[0];
        // }
        // Arrays.sort(nums);
        // if(nums[0]!=nums[1]){
        //     return nums[0];
        // }
        // for(int i=1;i<n;i++){
        //     if((i+1<n)&&(nums[i]!=nums[i-1]) && (nums[i]!=nums[i+1])){
        //         return nums[i];
        //     }


        // }
        // if(nums[n-2]!=nums[n-1]){
        //     return nums[n-1];
        // }
        // return -1;

        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            result=result^nums[i];

        }
        return result;
    }
}