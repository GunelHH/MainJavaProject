package lesson19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        sumOfNums(a,b);

    }
    public static void sumOfNums(int a,int b){
       ArrayList<Integer>arr=new ArrayList<>();
        for (int i = a; i <=b ; i++) {
            if (i%2==1) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
