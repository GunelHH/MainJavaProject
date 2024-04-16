package lesson13;

public class Main {
    public static void main(String[] args) {
        Human human=new Human("Gunel","Hasanova",2002);
        Human human1=new Human("Xeyransa","Pashayeva",1997,human,human);
        Pet pet=new Pet("Cat","Kitty");
        String[] arr={"blah","blah","blah"};
        Pet pet1=new Pet("Dog","Doggy",3,52,arr);

        Human human2=new Human("Ilqar","Mustafayev",2001, (byte) 100,pet,human,human);
         human2.describePet();
         human2.greetPet();

         pet.eat();
         pet.respond("Candyyy");
         pet.foul();

        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);

        System.out.println(pet1);
        System.out.println(pet);

    }
}
