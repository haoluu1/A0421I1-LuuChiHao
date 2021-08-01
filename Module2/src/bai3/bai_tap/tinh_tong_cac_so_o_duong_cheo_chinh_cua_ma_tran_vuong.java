package bai3.bai_tap;

import java.util.Scanner;

public class tinh_tong_cac_so_o_duong_cheo_chinh_cua_ma_tran_vuong
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so kich thuoc ma tran: ");
        int kt=scanner.nextInt();
        int h=kt,c=kt;
        int A[][]=new int[h][c];
        for (int i=0;i<h;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print("Nhap phan tu: ["+i+"]["+j+"]");
                A[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<h;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\n");
        }
        int S=0;
        for(int i=0;i<h;i++)
        {
            S=S+A[i][i];
        }
        System.out.println("Tong duong cheo chinh: "+S);
    }
}
