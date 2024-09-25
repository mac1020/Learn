package Mehak.com;
import java.util.ArrayList;
import java.util.Scanner;

public class Multi_ArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();

//        Initialisation
        for (int i=0;i<3;i++)
        {
            l.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                l.get(i).add(s.nextInt());
            }
        }
        System.out.println(l); //Internally it's calling toString method
    }
}
