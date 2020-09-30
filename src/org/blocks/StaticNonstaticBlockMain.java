package org.blocks;

public class StaticNonstaticBlockMain {


    static int x;

    static {
        // static variables. static methods
        System.out.println("static statement1");
        System.out.println(x);
        x = 10;
    }

    static {
        System.out.println("static statement2");
    }

    {
        System.out.println("non static statement1");
        if (x == 0) {
            System.out.println("invalid value of x!!!");
        }
    }

    {
        System.out.println("non static statement2");
    }

    public static void main(String[] args) {

        System.out.println("main method output");
        new StaticNonstaticBlockMain(); // 1st object
        new StaticNonstaticBlockMain(); // 2nd object
    }

    public void StaticNonstaticBlockMain() {
        System.out.println("constructor executed");
    }
}
