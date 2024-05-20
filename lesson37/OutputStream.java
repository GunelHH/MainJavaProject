package lesson37;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class OutputStream {
    public static final String RESOURCE="/Users/gunelhesenova/Desktop/JavaProjects/src/lesson37/resource/";

    public static void main(String[] args) {



        try{
            FileOutputStream fos=new FileOutputStream(RESOURCE+"outputfile.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            for (int i = 0; i <20 ; i++) {
                double randomNumber = Math.random();
                int rm=(int)(randomNumber*100);
                bos.write(rm);
            }
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        }

        try{
            FileInputStream fis=new FileInputStream(RESOURCE +"outputfile.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            byte[]bytes=bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));

        }catch (IOException e){
            e.getMessage();
        }
    }

}
