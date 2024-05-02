package lesson27;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book=new Book("Filan kitab","Author",BookStatus.AVAILABLE);

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        try {
            int parsed=Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("After all");
        }
    }
}
