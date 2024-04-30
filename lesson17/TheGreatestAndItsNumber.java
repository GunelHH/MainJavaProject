package lesson17;

import java.util.Scanner;

public class TheGreatestAndItsNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Size daxil edin");
        int size=sc.nextInt();
        int[]arr=new int[size];
        int maxLem=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
            if (arr[i] >maxLem) {
                maxLem=arr[i];
                count=i+1;

            }
        }

        System.out.println(maxLem+ " "+count);
    }
}
