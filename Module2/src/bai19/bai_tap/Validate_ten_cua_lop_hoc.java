package bai19.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate_ten_cua_lop_hoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input class name: ");
        String className = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIKLM]$");
        if(pattern.matcher(className).find()){
            System.out.println("OK");
        }else {
            System.out.println("nOK");
        }
    }
}
