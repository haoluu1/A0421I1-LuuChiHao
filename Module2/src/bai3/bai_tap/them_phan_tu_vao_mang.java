package bai3.bai_tap;

import java.util.Scanner;

public class them_phan_tu_vao_mang
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        int A[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu "+i+" : ");
            A[i]=scanner.nextInt();
        }
        System.out.println("Nhap so can them: ");
        int k=scanner.nextInt();
        System.out.println("Nhap vi tri can them:");
        int m=scanner.nextInt();
        int B[]=new int[n+1];
        for(int i=0;i<=m;i++)
        {
            if(i==m)
            {
                B[i]=k;
            }
            else
            {
                B[i]=A[i];
            }
        }
        for(int i=m+1;i<n+1;i++)
        {
            B[i]=A[i-1];
        }
        for (int i = 0; i < n+1; i++)
        {
            System.out.print(B[i] + "\t");
        }
    }
}
