package Mehak.com.OOP;
import  java.lang.Integer;

public class Wrapper_class {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = 20;
        System.out.println(a+" "+b);
        final A Mehak = new A("Mehak Kushwaha");
        System.out.println(Mehak.name);
        Mehak.name = "Gauri Kushwaha";
        System.out.println(Mehak.name);
        // when a non-primitive is final, you can't reassign it
        //Mehak = new A("New Name");

        A obj;
        for(int i=0;i<10000000;i++)
        {
            obj = new A("Mehak Kushwaha");
        }
    }
}
class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Removed");
    }
}