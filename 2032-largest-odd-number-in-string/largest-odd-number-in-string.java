// class Solution {
//     public String largestOddNumber(String num) {
//         int n=num.length();
       
//         if((num.charAt(n-1)-'0')%2 !=0){
//             return num;
//         }
//         char arr[]=num.toCharArray();
//         int max=-1;
//         for(char ch:arr){

//             int temp= ch-'0';
//             if(temp%2 !=0 && temp>max){
//                 max=temp;

//             }
//         }
//         if (max != -1) {
//             StringBuilder ans = new StringBuilder();
//             for (int i = 0; i < n; i++) {
//                 if ((char) (max + '0') == arr[i]) {
//                     ans.append(max);
//                     return ans.toString();
//                 } else {
//                     ans.append(arr[i]);
//                 }
//             }
//         }
        
//         return "";
//     }
// }

class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        
        // Traverse from the end to find the rightmost odd digit
        for (int i = n - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        
        return ""; // No odd digit found
    }
}
