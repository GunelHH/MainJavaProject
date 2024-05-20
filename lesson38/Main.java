package lesson38;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static  final String RESOURCE="/Users/gunelhesenova/Desktop/JavaProjects/src/lesson38/resource/";
    public static void main(String[] args) throws IOException {
        Person person=new Person("Gunel","Hasanova",21);
        Person person1=new Person("Jeyhuna","Nabizada",24);
        Person person2=new Person("Khayransa","Pashayeva",27);
        Person person3=new Person("Gunel","Hasanova",21);
        Person person4=new Person("Gunel","Hasanova",21);

        ArrayList<Person> persons=new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);



        try( FileOutputStream fos=new FileOutputStream(RESOURCE+"person.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(persons);
        }catch (IOException e){
            e.getMessage();
        }

        try( FileInputStream fos=new FileInputStream(RESOURCE+"person.ser");
             BufferedInputStream bos = new BufferedInputStream(fos);
             ObjectInputStream oos = new ObjectInputStream(bos)){
            ArrayList<Object> object= (ArrayList<Object>) oos.readObject();
            for (int i = 0; i <persons.size() ; i++) {
                System.out.println(object);
            }

        }catch (IOException e){
            e.getMessage();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
