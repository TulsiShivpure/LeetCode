class Solution {
    public int[] productExceptSelf(int[] nums) {
       int prod=1;
       int zero=0;
       for(int n: nums){
        if(n!=0){
        prod*=n;
        }else{
            zero++;
        }
       } 
       int ans[]=new int[nums.length];
       if(zero>1){
        Arrays.fill(ans,0);
        return ans;
       }
       for(int i=0;i<nums.length;i++){
        if(zero==0){
        ans[i]=prod/nums[i];
        }
        if(nums[i]!=0 && zero==1){
        ans[i]=0;
        }else if(nums[i]==0){
            ans[i]=prod;
        }
       }
       return ans;
    }
}