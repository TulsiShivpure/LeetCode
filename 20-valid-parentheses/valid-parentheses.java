class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
            }else if((st.isEmpty()==false) && (matching(st.peek(),ch))){
               
                st.pop();
            }else{
                return false; 
            }
        }
        return st.isEmpty();
    }
    public boolean matching(char a,char b){
        return ((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'));
    }
}