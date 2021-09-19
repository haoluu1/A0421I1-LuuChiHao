package bai17.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSP;
    private String tenSP;
    private String hangSX;
    private int gia;
    private String khac;

    public Product() {
    }

    public Product(int maSP, String tenSP, String hangSX, int gia, String khac) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSX = hangSX;
        this.gia = gia;
        this.khac = khac;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getKhac() {
        return khac;
    }

    public void setKhac(String k) {
        this.khac = khac;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", gia=" + gia +
                ", khac='" + khac + '\'' +
                '}';
    }
}
