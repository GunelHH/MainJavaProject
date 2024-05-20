package lesson34;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateFile {
    public static final String RESOURCE = "/Users/gunelhesenova/Desktop/JavaProjects/src/lesson34/resource/";

    public static void main(String[] args) {
//        File file = new File();
        try {
//            FileWriter fw=new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
            try (FileWriter fw = new FileWriter(RESOURCE + "test.txt")) {
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Hello\n");
                bw.write("Hello\n");
                bw.write("Hello\n");
                bw.close();
            }


            Path path = Paths.get(RESOURCE + "test.txt");
            try {
                try( FileReader fr=new FileReader(RESOURCE + "test.txt")){
                    BufferedReader bw = new BufferedReader(fr);
                    String line;
                    while ((line=bw.readLine()) != null) {
                        System.out.println(line);
                    }
//                    bw.close();
                }
//                List<String> lines = Files.readAllLines(path);
//                System.out.println(lines);
            } catch (IOException ex) {
               ex.printStackTrace();
            }
//            char[] ch=new char[3];
//            ch[0]='1';
//            ch[1]='2';
//            ch[2]='3';
//            bw.write(ch);


//            belede yaza bilerik
//            fw.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
