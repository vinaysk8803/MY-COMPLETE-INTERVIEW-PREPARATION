package Sorting;

import java.util.Arrays;

public class CountSort {
    static void countSort(int[] arr){
        int len = arr.length;
        int k = Integer.MIN_VALUE;

        //finding max value of array so we can make count arr of k size
        for (int i = 0; i <len ; i++) {
            if(arr[i]>k) {
                k = arr[i];
            }
        }
        //count arr will store all the frequency
        int[] count = new int[k+1];
        for (int i = 0; i <len ; i++) {
            ++count[arr[i]];
        }
        //update starting index of each element in array
        for (int i = 1; i <=k ; i++) {
            count[i] = count[i]+ count[i-1];
        }
        // ans for storing value right to left storing element at its current index
        int ans[] = new int[len];
        for (int i = len-1; i>=0 ; i--) {
            ans[--count[arr[i]]] = arr[i];

        }
        // copying all elements of ans in original array
        for (int i = 0; i <len ; i++) {
            arr[i] = ans[i];

        }

    }

    public static void main(String[] args) {
        int arr[] = {2,1,1,0,2,5,4,0,2,8,7,7,9,0,1,9};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
