package ru.mts.OsintcevIlya.MyProject01;

public class Main {
    public static void sayHello() {
        System.out.println("Привет мир! По Русски.");
    }

    public static void main(String[] args) {
        sayHello();
        for(int i = 0; i <= 2; i++) {
            System.out.println("i= "+ i);
            //System.out.println("Hello world! In English. i= " + i);
        }
    }
}