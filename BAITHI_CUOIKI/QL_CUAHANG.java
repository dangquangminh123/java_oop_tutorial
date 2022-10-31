/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITHI_CUOIKI;

/**
 * Đặng Quang Minh
 * @author DELL
 */
public class QL_CUAHANG {
    private int n;
    private CUAHANG [] a;
    
    //Khai báo phần tử trong mảng a và giá trị n
    public QL_CUAHANG () {
        this.n=0;
        this.a = new CUAHANG [100];
    }
    
    public void f_nhap () {
        a[n] = new NGUYENKIM("Điện Biên Phủ", 10, 001, 30, 001, 20);
        n++;
        a[n] = new DIENMAYCHOLON("Tân Kỳ Tân Quý", 15, 003, 50, 001, 35, 19);
        n++;
        a[n] = new DIENMAYXANH("Hòa Bình", 25, 002, 80, 001, 50, 29, 3);
        n++;
        a[n] = new FPTSHOP("Huỳnh Thiện Lộc", 50, 004, 90, 001, 50, 21, 7, 15);
        n++;
    }
    
    public void f_xuat () {
        //
        for (int i=0; i<this.n; i++) {
            System.out.println(""+a[i].toString());
        }
    }
    
    public void f_doanhthu_loinhuan_caonhat () {
        //cửa hàng có doanh thu và lợi nhuận cao nhất
        int Doanhthu=0;
        int loinhuan=0;
        for (int i=0; i<this.n; i++) {
            if (Doanhthu<a[i].f_doanhthu() && loinhuan<a[i].f_LoiNhuan()) {
                Doanhthu=a[i].f_doanhthu();
                loinhuan=a[i].f_LoiNhuan();
            }
            System.out.println("Cửa hàng có doanh thu và lợi nhuận cao nhất là"+ a[i].getname());
        }
    }
    
    public void f_dt_ln_8tr () {
        //Các cửa hàng có doanh thu và lợi nhuận trên 8 triệu
        for (int i=0; i<this.n; i++) {
            if(a[i].f_doanhthu()>8000000 && a[i].f_LoiNhuan()>8000000) {
                System.out.println(""+a[i].getname());
            }
        }
    }
    
    public void f_chiphi_FPT () {
        //Chi phí sản xuất của FPTSHOP
        if(a[n].getname()=="FPTSHOP") 
            System.out.println(""+a[n].f_chiphisanxuat());
    }
    
    
}
