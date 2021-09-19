package bai4.bai_tap.xay_dung_lop_stop_watch;

import java.util.Arrays;

public class main
{
    public static void main(String[] args)
    {
        int[] numbers = new int[99999];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=(int)(Math.random()*99999);
        }
        stop_watch stop_watch = new stop_watch();
        Arrays.sort(numbers);
        stop_watch.stop();
        System.out.println("milisecond: "+stop_watch.getElapsedTime());
    }
}
