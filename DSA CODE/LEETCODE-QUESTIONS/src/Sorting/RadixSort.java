package Sorting;

import java.util.Arrays;

public class RadixSort {
    static void radixSort(int[] arr){
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>k) {
                k = arr[i];
            }
        }
        for (int pos = 1; k/pos>0 ;pos = pos*10) {
            countSort(arr,pos);

        }
    }
    static void countSort(int[] arr,int pos){
        int len = arr.length;
        int[] count = new int[10];
        for (int i = 0; i <len ; i++) {
            ++count[(arr[i]/pos)%10];
        }
        for (int i = 1; i <10 ; i++) {
            count[i] = count[i]+ count[i-1];
        }
        int ans[] = new int[len];
        for (int i = len-1; i>=0 ; i--) {
            ans[--count[(arr[i]/pos)%10]] = arr[i];

        }
        for (int i = 0; i <len ; i++) {
            arr[i] = ans[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = {15,1,321,10,802,25,90,109,44,657,744};
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
