class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=1;
        int temp[]=new int[n];
        Arrays.fill(temp,-1);
        temp[0]=nums[0];
        for(int i=1;i<n;i++){
          if(nums[i]!=nums[i-1]){
            temp[k]=nums[i];
            k++;
          }
        //   else{
        //     nums[i]=-1;
        //   }
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
        return k;
    }
}