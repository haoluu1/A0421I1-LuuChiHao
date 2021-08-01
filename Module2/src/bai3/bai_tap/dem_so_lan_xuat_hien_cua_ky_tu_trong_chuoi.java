package bai3.bai_tap;

import java.util.Scanner;

public class dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String chuoi = scanner.nextLine();
        System.out.println("Nhap ky tu");
        char kt = scanner.nextLine().charAt(0);
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++)
        {
            char c = chuoi.charAt(i);
            if (c == kt)
            {
                dem++;
            }
        }
        System.out.println("Ky tu: "+kt+" xuat hien: "+dem+" lan");
    }
}
