package lesson24;

import java.util.Optional;

public class GenericMethod {
    private static <T> Optional<T> method(T data){
        if (data == null) {
            return Optional.empty();
        }else{
            return Optional.of(data);
        }
    }
}
