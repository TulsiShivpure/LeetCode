class Solution {
    public int maximumCount(int[] nums) {
       int countp=0;
       int countn=0;
       for(int n: nums){
        if(n>0){
            countp++;
        }
        if(n<0){
            countn++;
        }
       } 
       if(countp>countn){
        return countp;
       }else{
        return countn;
       }
    }
}