package org.emkor;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MyLibrary lib = new MyLibrary();
        int myNumber = lib.getNumber();
        System.out.println("Hello World: " + myNumber);
    }
}
