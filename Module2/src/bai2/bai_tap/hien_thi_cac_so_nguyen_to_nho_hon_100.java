package bai2.bai_tap;

public class hien_thi_cac_so_nguyen_to_nho_hon_100
{
    public static void main(String[] args)
    {
        System.out.print("cac so nguyen to nho hon 100\n");
        int tam=0;
        for(int i=1;i<=100;i++)
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
        }
    }
}
