package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class xor {
    static boolean  isValid(String s) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i= 0;i<s.length();i++){
            if(count1 <0 || count2<0 || count3 <0){
                return false;
            }
            if(s.charAt(i) == '(')
            {
                count1++;
            }
            else if(s.charAt(i) == ')'){
                count1 --;
            }
            else if(s.charAt(i) == '['){
                count2 ++;

            }
            else if(s.charAt(i) == ']'){
                count2 --;

            }
            else if(s.charAt(i) == '{'){
                count3 ++;

            }
            else if(s.charAt(i) == '}'){
                count3 --;

            }


        }
        return count1 == 0 && count2 ==0 && count3 == 0 ;
    }
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}
