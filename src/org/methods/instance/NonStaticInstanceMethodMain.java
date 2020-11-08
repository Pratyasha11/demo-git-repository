package org.methods.instance;

public class NonStaticInstanceMethodMain {
    public static void main(String[] args) {


        NonStaticInstanceMethodMain refVar = new NonStaticInstanceMethodMain();

        refVar.sum();
        refVar.sum(20, 40);

        int sumValue = refVar.sum1(20, 25);
        System.out.println(sumValue);
    }

    int sum1(int x, int y)
    {
        int res = x + y;
        return 2;
    }

    void sum(int x, int y)
    {
        int res = x + y;
        System.out.println(res);
    }

    void sum() {
        int res = 10 + 20;
        System.out.println(res);
    }

    static void welcome() {
        System.out.println("welcome message from static method");
    }
}
