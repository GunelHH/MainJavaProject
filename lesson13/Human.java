package lesson13;

    public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private byte iq;
    private Pet pet;
    private Human mother;
    private Human father;

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirth, byte iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }
    public Human(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }
    public void greetPet(){
        System.out.println("Hello,"+pet.nickname);
    }
   public void describePet(){
       System.out.println("i have a"+pet.speciase+", he is "+pet.age+" years old,he is "
               +(pet.trickLevel>50 ?"almost not sly":"very sly"));
   }

    @Override
    public String toString() {
        return "Human{name='%s', surname='%s', dateOfBirth=%d, iq=%s, pet=%s, mother=%s, father=%s}"
                .formatted(name, surname, dateOfBirth, iq, pet, mother, father);
    }

}
