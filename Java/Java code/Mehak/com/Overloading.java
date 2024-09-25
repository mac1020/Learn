package Mehak.com;

public class Overloading {
    public static void main(String[] args) {
        fun(9);
        fun(2,6);
        fun("Mehak");
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(int a, int b)
    {
        System.out.println(a+b);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
}
// at compile it's going to decide which function to run
