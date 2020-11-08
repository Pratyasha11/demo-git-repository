package org.variables.constants;

public class ConstantVariablesMain {


    static final String staticConstant;
    final int age = 30;
    static {
        staticConstant = "some static value";

    }



    public static void main(String[] args) {
        System.out.println(staticConstant);
        ConstantVariablesMain constantVariablesMain = new ConstantVariablesMain();
        System.out.println(constantVariablesMain.age);
        constantVariablesMain.sum(10, 20);

        int data = 300;
        final int marks = 75;
        System.out.println(data);
        System.out.println(marks);
    }

    public void sum(final int x, final int y)
    {

        final int result = x + y;

        System.out.println("sum of x & y: "+result);
    }
}
