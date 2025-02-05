class Solution {
    public int distributeCandies(int[] candyType) {
        int count=1;
        int n = candyType.length;
        int candy=n/2;
        Arrays.sort(candyType);
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                count++;
            }
            if(count==candy){
                return count;
            }
        }
        if(count>candy){
            return candy;
         }
         else{
             return count;

         }
        
       
    }
}