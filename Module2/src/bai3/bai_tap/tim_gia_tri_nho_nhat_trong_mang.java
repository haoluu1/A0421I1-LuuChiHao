package bai3.bai_tap;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat_trong_mang
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu "+i+": ");
            A[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        int min=A[0];
        int vt=0;
        for(int i=0;i<n;i++)
        {
           if(min>A[i])
           {
               min=A[i];
               vt=i;
           }
        }
        System.out.println("Gia tri nho nhat: "+min+" vi tri: "+vt);
    }
}
