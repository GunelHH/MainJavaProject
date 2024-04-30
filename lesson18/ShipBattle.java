package lesson18;

import java.util.Arrays;
import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {

        String[][] arr = new String[6][6];
        Scanner sc = new Scanner(System.in);
        double n = Math.random() * 6;
        int n1 = (int) n;
        double m = Math.random() * 6;
        int m1 = (int) m;
        System.out.println(n1 + "--" + m1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    arr[i][j] = String.valueOf(j);
                } else if (j == 0) {
                    arr[i][j] = String.valueOf(i);
                } else {
                    arr[i][j] = "-";
                }
            }
        }

        Print(arr);
        while (true) {
            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            if (n2 == n1 && m2 == m1) {
                arr[n2][m2] = "x";
                Print(arr);
                System.out.println("Qalib!!");
                break;
            } else {
                arr[n2][m2] = "*";
                Print(arr);
            }
        }
    }

    public static void Print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }
}

