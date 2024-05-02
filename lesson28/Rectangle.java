package lesson28;

import lesson27.IBook;

public class Rectangle implements IShape {
    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void perimeter() {
        System.out.println((this.height + this.weight) * 2);
    }

    @Override
    public void area() {
        System.out.println(this.height * this.weight);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
