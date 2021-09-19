package bai16.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void main(String args[])
            throws FileNotFoundException,IOException {
        FileInputStream fis = new FileInputStream("text1.txt");

        FileOutputStream fos = new FileOutputStream("text2.txt");

        int a;
        while  ((a=fis.read()) != -1)
            fos.write(a);

        fis.close();
        fos.close();
    }
}
