package lesson39;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JsonApp {
    public static final String RESOURCE="/Users/gunelhesenova/Desktop/JavaProjects/src/lesson39/resource/";
    public static final Path PATH= Paths.get(RESOURCE+"file.txt");
    public static void main(String[] args) {
        Person person = new Person("Test", "test", 22);
        String personJson="";
        try{
            ObjectMapper om=new   ObjectMapper();
          personJson =om.writeValueAsString(person);
        }catch (JsonProcessingException e){
            e.getMessage();
        }
        System.out.println(personJson);

        try{
          ObjectMapper objectMapper = new ObjectMapper();
          byte[] byteArray = objectMapper.writeValueAsBytes(personJson);
         Files.write(PATH,byteArray);

        }catch (IOException e){
            e.getMessage();
        }

        try{
            List<String> strings=Files.readAllLines(PATH);
            System.out.println(strings);
        }catch (IOException e){
            e.getMessage();
        }

//        mvn core,annotation,byte-buddy
    }
}
