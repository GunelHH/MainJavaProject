package lesson22;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={5,3,7,2,1,4};
        selection(arr);
    }
    public static void selection(int[]arr){
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            int min=i;
            for (int j = i; j <arr.length ; j++) {
                if (arr[min]>arr[j]){
                  min=j;
                }
            }
            if (min != i) {
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}

