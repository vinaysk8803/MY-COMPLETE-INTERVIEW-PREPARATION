package Strings;
//171. Excel Sheet Column Number
//Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.
//
//        For example:
//
//        A -> 1
//        B -> 2
//        C -> 3
//        ...
//        Z -> 26
//        AA -> 27
//        AB -> 28
//        ...
//Input: columnTitle = "A"
//        Output: 1
//        Example 2:
//
// Input: columnTitle = "AB"
//        Output: 28
//        Example 3:
//
// Input: columnTitle = "ZY"
//        Output: 701

public class leetcode171 {
    static int titleToNumber(String s) {
        int n = s.length();
//        int count = 0;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+= sum * 26 + (s.charAt(i) - 'A' +1);
        }
 return sum;
//         int titleToNumber(String s) {
//            int result = 0;
//            for(int i = 0 ; i < s.length(); i++) {
//                result = result * 26 + (s.charAt(i) - 'A' + 1);
//            }
//            return result;


        }

    public static void main(String[] args) {

    }
}
