package lesson26;

public class Cake extends BakeryClass implements Checkable {
    private String name;
    private double price;

    private Sizes size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cake(String name, double price, Sizes size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    void bake(String name) {
        super.bake(name);
    }

    @Override
    public void controlCleanless(boolean check) {
        System.out.println(check ? "Temizliye riayet edilib" : "Temizliye riayet edilmeyib");

    }
}
