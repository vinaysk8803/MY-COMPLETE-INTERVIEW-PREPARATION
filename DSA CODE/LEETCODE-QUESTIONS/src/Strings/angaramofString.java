package Strings;

//Given a word pat and a text txt. Return the count of the occurences of anagrams of the word in the text.
// Example 1:
//        Input:
//        txt = forxxorfxdofr
//        pat = for
//        Output: 3
//        Explanation: for, orf and ofr appears in the txt, hence answer is 3.
// Example 2:
//        Input:
//        txt = aabaabaa
//        pat = aaba
//        Output: 4
//        Explanation: aaba is present 4 times in txt.

//        Your Task:
//        Complete the function search() which takes two strings pat, txt, as input parameters and returns an integer denoting the answer. You don't to print answer or take inputs.
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(26) or O(256)


import java.util.Arrays;

public class angaramofString {
    static int search(String p, String s) {
        int n=s.length();
        int m=p.length();
        if(n<m)
            return 0;

        int[] pfreq= new int[26];
        int[] sfreq= new int[26];
        for(int i=0;i<m;i++)
        {
            pfreq[p.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++)
        {
            sfreq[s.charAt(i)-'a']++;
        }
        int result = 0;
        //a b c b b d
        for(int i=m;i<n;i++)
        {
            if(Arrays.equals(pfreq,sfreq))
            {
                result++;
            }
            sfreq[s.charAt(i)-'a']++;
            sfreq[s.charAt(i-m)-'a']--;

        }
        if(Arrays.equals(pfreq,sfreq))
        {
            result++;
        }
        return result;

    }

    public static void main(String[] args) {
        int res = search("for","forxxorfxdofr");
        System.out.println(res);
    }
}
