package Mehak.com;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        int x;
        x = 40; // the class variable at line 8 will be shadowed by this
//        shadowing/scope will start at the time of initiation not at the time of declaration
//        shadowing does not work for methods it's for class variable
        System.out.println(x);
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
}
