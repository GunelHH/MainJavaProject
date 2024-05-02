package lesson28;

public class Triangle implements IShape {
    private int a;
    private int b;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int c;

    @Override
    public void perimeter() {
        System.out.println(this.a + this.b + this.c);
    }

    @Override
    public void area() {
        int prm = (this.a + this.b + this.c) / 2;
        System.out.println(Math.sqrt(prm * (prm - a) * (prm - b) * (prm - c)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
