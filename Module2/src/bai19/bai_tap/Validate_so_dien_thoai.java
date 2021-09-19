package bai19.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate_so_dien_thoai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input phone number: ");
        String phone = scanner.nextLine();
        Pattern pattern = Pattern.compile("^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$");
        if(pattern.matcher(phone).find()){
            System.out.println("OK");
        }else {
            System.out.println("nOK");
        }
    }
}
