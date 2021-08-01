package bai4.bai_tap.xay_dung_lop_phuong_trinh_bac_hai;

public class phuong_trinh_bac_hai
{
    double a,b,c;
    double delta;
    double x1,x2;
    public phuong_trinh_bac_hai()
    {
    }
    public phuong_trinh_bac_hai(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double delta()
    {
        return  this.b*this.b - 4*this.a*this.c;
    }
    public double x1()
    {
        delta = this.delta();
        x1=(-this.b + Math.sqrt(delta)) / (2*this.a);
        return x1;
    }
    public double x2()
    {
        delta = this.delta();
        x2=(-this.b - Math.sqrt(delta)) / (2*this.a);
        return x2;
    }
}
