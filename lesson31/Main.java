package lesson31;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

    }
    public static class ThreadClass extends Thread{
        public ThreadClass(String name) {
            super(name);
        }
        public void run(){
            for (int i = 0; i <3 ; i++) {

            }
        }
        public static  class  MyThread implements Callable<String> {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        }

    }

}


