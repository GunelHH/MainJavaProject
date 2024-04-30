package lesson19;

import java.util.*;

public class ExistInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       Set<Integer> arr=new HashSet<>();
       arr.add(2);
       arr.add(1);
       arr.add(5);
       arr.add(6);
       arr.add(7);
        List<Integer>nums=new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        searchArray(arr,num);

    }
    public static void searchArray(Collection<Integer> arr, int num){
        if (arr.contains(num)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
