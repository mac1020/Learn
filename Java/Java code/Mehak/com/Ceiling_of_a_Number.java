package Mehak.com;
import java.util.Scanner;

public class Ceiling_of_a_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int target;
        target = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        a[i]= s.nextInt();
        System.out.println(find_number_ceiling(a,target));
        System.out.println(find_number_floor(a,target));
    }
    public static int find_number_ceiling(int[] a,int n)
    {
        int s,e;
        s=0; e=a.length-1;
        while(s<=e&&e>=0)
        {
            int m;
            m=s+(e-s)/2;
            if(a[m]==n)
            {
                s=m;
                break;
            }
            else if (a[m]<n)
                s=m+1;
            else
                e=m-1;
        }
        return a[s];
    }
    public static int find_number_floor(int[] a,int n)
    {
        int s,e;
        s=0; e=a.length-1;
        while(s<=e&&e>=0)
        {
            int m;
            m=s+(e-s)/2;
            if(a[m]==n)
            {
                e=m;
                break;
            }
            else if (a[m]<n)
                s=m+1;
            else
                e=m-1;
        }
        return a[e];
    }
}
