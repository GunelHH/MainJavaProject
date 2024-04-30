package lesson22;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={32,23,15,12,17};
        sort(arr);
    }
    public static void sort(int[] arr){
        int changed=0;
        int f=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]) {
                    changed=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=changed;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
