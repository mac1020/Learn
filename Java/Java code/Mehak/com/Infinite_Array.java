package Mehak.com;

import java.io.OutputStream;
import java.util.Scanner;

public class Infinite_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = s.nextInt();
        System.out.println(number(a,target));
    }
    public static int number(int[] a, int n)
    {
        int s=0;
        int e=1;
        int k=-1;
        while(s<=e)
            {
                if(a[e]<n)
                {
                    int temp = e+1;
                    e = e+(e-s+1)*2;
                    s = temp;
                }
                else{
                    int m = s+(e-s)/2;
                    if(a[m]>n)
                        e=m-1;
                    else if(a[m]<n)
                        s=m+1;
                    else
                    {
                        k=m+1;
                        break;
                    }
                }
           }
        return k;
    }
}
