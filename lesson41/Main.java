package lesson41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player[] players={
                new Player("Smith",20),
                new Player("Jones",15),
                new Player("Jones",20)
        };

        ArrayList<Integer>a=new ArrayList<>();
        a.add(5);

        List<Integer> b=a;
        b.add(6);
        System.out.println("a= "+a+ "b "+b);
//        System.out.println(Arrays.toString(players));
//        Arrays.sort(players);
//        System.out.println(Arrays.toString(players));
//
//        System.out.println("===========================");
//        Arrays.sort(players,new PlayerScorAscComparator());
//        System.out.println(Arrays.toString(players));
//
//        System.out.println("=========================== with anonymous class");
//        Arrays.sort(players, Comparator.comparing(Player::getName));
//        System.out.println(Arrays.toString(players));
//        System.out.println("==================");



//        Student[] students={
//                new Student(1L,"Jeyhuna",24),
//                new Student(2L,"Kheyransa",27),
//                new Student(3L,"Gunel",21),
//        };
//        System.out.println(Arrays.toString(students));
//        System.out.println("=========");
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
//        System.out.println("======================= by name desc");

//
    }
}
