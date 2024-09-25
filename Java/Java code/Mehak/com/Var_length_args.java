package Mehak.com;
import java.util.Arrays;

public class Var_length_args {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
        multiple(2,7,"Mehak","Gauri");
    }
    static void multiple(int a, int b, String ...v) // variable length arguments always at the end
    {
        System.out.println((a+" "+b));
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
// variable length arguments when you don't know the length of input arguments are going to be passed
