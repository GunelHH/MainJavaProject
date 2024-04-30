package lesson24;

import java.time.LocalDateTime;

public class OverloadClass {
    public static void main(String[] args) {
        String a=null;
        Exception(a);
    }

    public static void Exception(String a){
        if (a == null) {
            throw new CustomException("Nulll");
        }
    }
    public static void Exception(Integer a){
        if (a == null) {
            throw new NullPointerException();
        }
    }
    public static void Exception(LocalDateTime a){
        if (a == null) {
            throw new NullPointerException();
        }
    }
}
