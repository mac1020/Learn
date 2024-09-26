package Mehak.com;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        reverse(a,0,n-1);
    }
    static void reverse(int[] a, int s, int e)
    {
        while (e>s)
        {
            int t;
            t = a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(a));
    }
}
