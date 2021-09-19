package bai2.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh
{
    public static void main(String[] args)
    {
        System.out.println("Hinh chu nhat");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=6;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("Tam giac vuong");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("Tam giac can");
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
