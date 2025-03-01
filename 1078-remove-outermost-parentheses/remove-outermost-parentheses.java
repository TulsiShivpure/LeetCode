class Solution {
    public String removeOuterParentheses(String s) {
        int l=0;
        int r=0;
        int countl=0;
        int countr=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                countl++;
            }else{
                countr++;
            }

            if(countl==countr){
                ans+=s.substring(l+1,i);
                l=i+1;

            }

        }
        return ans;
    }
}