package bai3.bai_tap;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang
{
    public static void main(String[] args)
    {
        int n,i,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        n = scanner.nextInt();
        int A[] = new int[n];
        for (i = 0; i < n; i++)
        {
            System.out.print("Nhap phan tu thu " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhap so nguyen k: ");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++)
        {
            if (A[i] != k)
            {
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mang sau khi xoa phan tu " + k + " là: ");
        for (i = 0; i < n; i++)
        {
            System.out.print(A[i] + "\t");
        }
    }
}
