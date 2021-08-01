package bai3.bai_tap;

import java.util.Scanner;

public class tinh_tong_cac_so_o_mot_cot_xac_dinh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang: [hang] []");
        int h=scanner.nextInt();
        System.out.println("Nhap so cot: [] [cot]");
        int c=scanner.nextInt();
        int A[][]=new int[h][c];
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Nhap phan tu: ["+i+"]["+j+"]");
                A[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Nhap so cot can tinh: ");
        int k=scanner.nextInt();
        int S=0;
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(j==k)
                {
                    S=S+A[i][j];
                }
            }
        }
        System.out.println("Tong cot can tinh: "+S);
    }
}
