package homePractice;

public  interface TestingAbstractMethods{
    default  void hello(){

    }
    public static void main(String[] args) {
        int x = 4 ,b = 2;

        System.out.println(x -= b/= x * b);
        System.out.println();

    }
}
