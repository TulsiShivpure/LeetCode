class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<=r){
            int sum=0;
            if(height[l]<=height[r]){
                sum=height[l]*(r-l);
                l++;

            }else{
                sum=height[r]*(r-l);
                r--;
            }

            if(sum>ans){
                ans=sum;
            }
            

        }
        return ans;
    }
}