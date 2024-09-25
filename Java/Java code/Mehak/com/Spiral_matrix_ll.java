package Mehak.com;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral_matrix_ll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Arrays.deepToString(array(n)));
    }
    public static int[][] array(int n)
    {
        int c = 1;
        int[][] a = new int[n][n];
        int l=0;
        int t=0;
        int r=n-1;
        int b=n-1;
        while(l<=r && t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                a[t][i]=c;
                c++;
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                a[i][r]=c;
                c++;
            }
            r--;
            for(int i=r;i>=l;i--)
            {
                a[b][i]=c;
                c++;
            }
            b--;
            for(int i=b;i>=t;i--)
            {
                a[i][l]=c;
                c++;
            }
            l++;
        }
        return a;
    }
}
