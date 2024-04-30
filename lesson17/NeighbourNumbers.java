package lesson17;

import java.util.Scanner;

public class NeighbourNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Size daxil edin");
        int size=sc.nextInt();
        int[]arr=new int[size];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1] &&arr[i]>arr[i+1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
