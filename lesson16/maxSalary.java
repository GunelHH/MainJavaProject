package lesson16;

import java.util.Scanner;

public class maxSalary {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        double maxSalary=-1;
//        double salary;
//
//        while (sc.hasNext()){
//            salary=sc.nextDouble();
//            if (maxSalary <salary) {
//                maxSalary=salary;
//            }
//        }
//        System.out.printf("%.2f",maxSalary);
//    }
public static void main(String[] args) {
//    String srt="Java";
//    srt.concat(" slsd");
//    System.out.println(srt);
//    System.out.println( srt.concat(" slsd"));

    int result = sum(10);
    System.out.println(result);
}
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
