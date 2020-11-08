package org.oops.constructors;

class BasicEx
{
    BasicEx()
    {
        System.out.println("constructor...");

    }
    {
        System.out.println("non-static block1");
    }
    public static void main(String[] args)
    {

        System.out.println("main method");
        BasicEx b1 = new BasicEx();
        BasicEx b2 = new BasicEx();
        System.out.println("ok");
    }
}