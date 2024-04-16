package lesson13;

import java.util.Arrays;

public class Pet {
    public String speciase;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet(String speciase, String nickname) {
        this.speciase = speciase;
        this.nickname = nickname;
    }

    public Pet(String speciase, String nickname, int age, int trickLevel, String[] habits) {
        this.speciase = speciase;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet(){

    }

    public String getSpeciase() {
        return speciase;
    }

    public void setSpeciase(String speciase) {
        this.speciase = speciase;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String eat() {
        return "I am eating";
    }
    public void respond(String name){
        System.out.println("Hello,owner.I am "+nickname+".I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet{speciase='%s', nickname='%s', age=%d, trickLevel=%d, habits=%s}"
                .formatted(speciase, nickname, age, trickLevel, Arrays.toString(habits));
    }
}
