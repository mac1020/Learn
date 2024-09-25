package Mehak.com;

public class Block_Scope {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);
        {
//            int a = 90;  can't initialize again cause already initialized outside the block
            a = 90;
            int c = 45;
            System.out.println(a+" "+c);
        }
        System.out.println(a);
//        System.out.println(c); can't access c cause scope is inside block only
    }
}
// anything initialized outside the block can be used inside the block but
// anything initialized inside the block can't be used outside the block
// same goes for loop scope