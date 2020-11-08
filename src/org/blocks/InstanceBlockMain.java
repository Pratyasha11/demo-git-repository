package org.blocks;

public class InstanceBlockMain {


        {
            System.out.println("non-static statement1");
            System.out.println("non-static statement2");
        }

        {
            System.out.println("non-static statement3");
            System.out.println("non-static statement4");
        }

        public static void main(String[] args) {

            System.out.println("main method output");
            new InstanceBlockMain();
            System.out.println("------------------------------");
            new InstanceBlockMain();
            System.out.println("**********************************");
            new InstanceBlockMain();
        }
    }

