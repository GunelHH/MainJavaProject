package lesson16;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MultyDimensionalWeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week:");
        String day = sc.next().toLowerCase();

        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday".toLowerCase();
        schedule[1][1] = "monday plan";

        schedule[2][0] = "Tuesday".toLowerCase();
        schedule[2][1] = "tuesday plan";

        schedule[3][0] = "Wednesday".toLowerCase();
        schedule[3][1] = "Wednesday plan";

        schedule[4][0] = "Thursday".toLowerCase();
        schedule[4][1] = "Thursday plan";

        schedule[5][0] = "Friday".toLowerCase();
        schedule[5][1] = "friday plan";

        schedule[6][0] = "Saturday".toLowerCase();
        schedule[6][1] = "Saturday plan";

        switch (day) {
            case "sunday":
                System.out.println(schedule[0][1]);
                break;
            case "monday":
                System.out.println(schedule[1][1]);
                break;
            case "tuesday":
                System.out.println(schedule[2][1]);
                break;
            case "wednesday":
                System.out.println(schedule[3][1]);
                break;
            case "thursday":
                System.out.println(schedule[4][1]);
                break;
            case "friday":
                System.out.println(schedule[5][1]);
                break;
            case "saturday":
                System.out.println(schedule[6][1]);
                break;

            default:
                System.out.println("Bizim gezegende bele bir gun yoxdur:))");
        }

    }
}
