package bai2.bai_tap;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to_dau_tien
{
    public static void main(String[] args)
    {
        System.out.print("20 so nguyen to dau tien\n");
        int tam=0;
        for(int i=1;i>=0;i++)
        {
            int dem=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    dem++;
                }
                if(dem>2)break;
            }
            if(dem==2)
            {
                System.out.print(i+" ");
                tam++;
            }
            if(tam==20)break;
        }
    }
}
