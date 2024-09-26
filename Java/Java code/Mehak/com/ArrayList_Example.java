package Mehak.com;
import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(10);
        l.add(67);
        l.add(6675);
        l.add(878);
        l.add(434);
        l.add(8767);
        System.out.println(l);
        l.set(0,21);
        l.contains(987);
        l.remove(3);
        System.out.println(l);
    }
}
