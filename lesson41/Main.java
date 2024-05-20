package lesson41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player[] players={
                new Player("Smith",20),
                new Player("Jones",15),
                new Player("Jones",20)
        };
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



        Student[] students={
                new Student(1L,"Jeyhuna",24),
                new Student(2L,"Kheyransa",27),
                new Student(3L,"Gunel",21),
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("======================= by name desc");

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });
        System.out.println(Arrays.toString(students));

        System.out.println("================= ny age asc");

        Arrays.sort(students, (s1, s2) -> Integer.compare(s1.getAge(),s2.getAge()));
        System.out.println(Arrays.toString(students));
    }
}
