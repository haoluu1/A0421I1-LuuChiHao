package bai3.bai_tap;

import java.util.Scanner;

public class gop_mang
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang 1: ");
        int m1=scanner.nextInt();
        int mang1[]=new int[m1];
        for(int i=0;i<m1;i++)
        {
            System.out.println("Nhap phan tu thu "+i+" mang 1: ");
            mang1[i]=scanner.nextInt();
        }
        System.out.println("Nhap so phan tu mang 2: ");
        int m2=scanner.nextInt();
        int mang2[]=new int[m2];
        for(int i=0;i<m2;i++)
        {
            System.out.println("Nhap phan tu thu "+i+" mang 2: ");
            mang2[i]=scanner.nextInt();
        }
        int m3=m1+m2;
        int mang3[]=new int[m3];
        for(int i=0;i<m1;i++)
        {
            mang3[i]=mang1[i];
        }
        for(int i=m1;i<m3;i++)
        {
            mang3[i]=mang2[i-m1];
        }
        System.out.println("Mang sau khi gop: ");
        for (int i=0;i<m3;i++)
        {
            System.out.print(mang3[i]+"\t");
        }
    }
}
