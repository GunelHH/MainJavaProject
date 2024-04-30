package RandomNumbers;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNum=(int)(Math.random()*10);
        Scanner sc=new Scanner(System.in);

        System.out.println("Type your name");

        String name=sc.next();
        System.out.println("Add number please "+name);

        do {
            int num=sc.nextInt();
            if (num<randomNum) {
                System.out.println("kicikdir yeniden daxil edin");
            } else if (num>randomNum) {
                System.out.println("boyukdur yeniden daxil edin");
            }else{
                System.out.println("congratulations");
                break;
            }
        }
        while (true);

    }
}
