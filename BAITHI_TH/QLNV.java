/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITHI_TH;

/**
 *
 * @author DELL
 */
public class QLNV {
    private int n; //Số lượng nhân viên trong đơn vị sản xuất
    private DV_SX [] M;
    
    public QLNV () {
        this.n=0;
        this.M = new DV_SX[1000];
    }//end QLNV
    
    /**
     * Phương thức nhập vào thông tin nhân viên
     */
    public void f_nhap () {
        M[n] = new NHANVIEN_VANPHONG();
        n++;
        M[n] = new NHANVIEN_VANPHONG("ĐẶNG QUANG MINH", "12 trịnh đình thảo", "nam", 1.5, 2);
        n++;
        M[n] = new NV_KINHDOANH("Trần Anh Vũ", "12 trịnh đình thảo","nam", 1.0, 2, 9000000, 2.0);
        n++;
        M[n] = new CONGNHAN("Nguyên Văn Tèo","123 mạc đĩnh chi","nam", 1.3, 2, 1200);
        n++;
    }
    
    /**
     * Phương thức xuất thông tin nhân viên
     */
    public void f_xuat () {
        //Xuất
        for (int i=0; i<this.n;i++) {

            System.out.println(M[i].get_Name()+M[i].f_luong());
        }
    }
    
   
}
