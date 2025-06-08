class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            if(!ans.contains(nums[i])){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>n/3){
                    ans.add(nums[i]);
                    count=0;
                    break;
                }
            }
            }

        }
        return ans;
    }
}