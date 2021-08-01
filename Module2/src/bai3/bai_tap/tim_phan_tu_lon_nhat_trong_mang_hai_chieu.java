package bai3.bai_tap;

import java.util.Scanner;

public class tim_phan_tu_lon_nhat_trong_mang_hai_chieu
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
                System.out.print("Nhap phan tu ["+i+"] ["+j+"]");
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
        int max=A[0][0];
        int maxh=0;
        int maxc=0;
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(max<A[i][j])
                {
                    max=A[i][j];
                    maxh=i;
                    maxc=j;
                }
            }
        }
        System.out.println("Gia tri lon nhat la: "+max+" vi tri: ["+maxh+"]["+maxc+"]");
    }
}

