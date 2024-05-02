package lesson28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IShape rectangle = new Rectangle(4, 5);
        rectangle.perimeter();
        rectangle.area();
        IShape triangle = new Triangle(3, 5, 7);
        triangle.area();
        triangle.perimeter();
        List<IShape> list = new ArrayList<>();
        list.add(rectangle);
        list.add(triangle);
        System.out.println(list);
    }
}
