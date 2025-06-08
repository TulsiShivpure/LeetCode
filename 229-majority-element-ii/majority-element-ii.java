class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     if(!ans.contains(nums[i])){
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //         if(count>n/3){
        //             ans.add(nums[i]);
        //             count=0;
        //             break;
        //         }
        //     }
        //     }

        // }

        Arrays.sort(nums);
        int count=1;
        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                if(count > n/3) {
                    ans.add(nums[i-1]);
                }
                count = 1;
            }
        }
        
        if(count > n/3) {
            ans.add(nums[n-1]);
        }

        return ans;
    }
}