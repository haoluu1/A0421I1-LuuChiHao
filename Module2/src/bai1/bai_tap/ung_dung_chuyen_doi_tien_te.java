package bai1.bai_tap;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ty gia: USD = ... VND");
        int ty_gia = scanner.nextInt();
        System.out.println("Nhap so USD: ");
        int usd = scanner.nextInt();
        int vnd = usd*ty_gia;
        System.out.println(usd+" USD = "+vnd+" VND");
    }
}
