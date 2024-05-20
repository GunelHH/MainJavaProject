package lesson26;

public class Main {
    public static void main(String[] args) throws CustomException {

        System.out.println(Sizes.SMALL.ordinal());
        BakeryClass cake = new Cake("SanSebastian", 20.2D, Sizes.MEDIUM);
        cake.bake("cheesecake");

        if (cake instanceof BakeryClass) {
            System.out.println("good");
        } else {
            throw new CustomException("Custom exception");
        }
    }
}
