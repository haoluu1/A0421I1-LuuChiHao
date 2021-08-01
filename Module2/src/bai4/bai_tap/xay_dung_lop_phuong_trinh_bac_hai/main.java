package bai4.bai_tap.xay_dung_lop_phuong_trinh_bac_hai;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        phuong_trinh_bac_hai phuong_trinh_bac_hai = new phuong_trinh_bac_hai(a,b,c);
        System.out.println("delta: "+ phuong_trinh_bac_hai.delta());
        if (a==0)
        {
            if (b==0)
            {
                if (c==0)
                {
                    System.out.println("Phuong trinh co vo so nghiem");
                }
                else
                {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else
            {
                System.out.println("Phuong trinh co mot nghiem");
                System.out.println(phuong_trinh_bac_hai.x1());
            }
        }
        else
        {
            if(phuong_trinh_bac_hai.delta()>0)
            {
                System.out.println("Phuong trinh co hai nghiem");
                System.out.println(phuong_trinh_bac_hai.x1());
                System.out.println(phuong_trinh_bac_hai.x2());
            }
            else if (phuong_trinh_bac_hai.delta()==0)
            {
                System.out.println("Phuong trinh co nghiem kep");
                System.out.println(phuong_trinh_bac_hai.x1());
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
