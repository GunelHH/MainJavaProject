package lesson31;

import homePractice.Threads;

public class Anonymous {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread name"+ Thread.currentThread().getName())){

        }.start();
    }

}
