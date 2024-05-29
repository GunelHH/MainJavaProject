package practiceWithJeyhuna;

import javax.xml.catalog.CatalogResolver;
import java.io.*;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) throws IOException {
        File data = new File("/Users/gunelhesenova/Desktop/JavaProjects/src/practiceWithJeyhuna/jeyhuna.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        System.out.println(file);
        System.out.println(filter);




    }

}
