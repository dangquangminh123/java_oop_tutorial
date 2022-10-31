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
public class NV_KINHDOANH extends NHANVIEN_VANPHONG {
    private  int doanhthu; //doanh thu của nhân viên kinh doanh
    private double phantram_hoahong; //phần trăm hoa hồng của nhân viên kinh doanh
    
    /**
     * Phương thức thiết lập giá trị doanh thu 
     * @param DT int
     */
    public void set_doanhthu (int DT) {
        this.doanhthu=DT;
    }//END set_doanhthu (int DT)
    
    /**
     * Phương thức trả về giá trị doanh thu
     * @return int
     */
    public int get_doanhthu () {
        return this.doanhthu;
    }//END get_doanhthu()
    
    /**
     * Phương thức thiết lập giá trị phần trăm hoa hồng
     * @param HH double
     */
    public void set_phantram_hoahong (double HH) {
        if(HH<0) {
            this.phantram_hoahong=0;
        }
        else {
            this.phantram_hoahong=HH;
        }
    }//END set_phantram_hoahong (double HH)
    
    /**
     * Phương thức trả về giá trị phần trăm hoa hồng
     * @return double
     */
    public double get_phantram_hoahong() {
        return this.phantram_hoahong;
    }//END get_phantram_hoahong()
    
    /**
     * Phương thức khởi tạo không tham số của nhân viên kinh doanh
     */
    public NV_KINHDOANH () {
        super();
        this.doanhthu=15000000;
        this.phantram_hoahong=2.5;
    }//END NV_KINHDOANH ()
    
    /**
     * Phương thức khởi 8 tạo tham số
     * @param HoTen String
     * @param DiaChi String
     * @param GioiTinh String
     * @param LCB int
     * @param hesoluong double
     * @param SoNam_CongTac int
     * @param doanhthu int
     * @param phantram_hoahong double 
     */
    public NV_KINHDOANH (String HoTen, String DiaChi, String GioiTinh, double hesoluong, int SoNam_CongTac, int doanhthu, double phantram_hoahong) {
        super(HoTen, DiaChi, GioiTinh, hesoluong, SoNam_CongTac);
        this.set_doanhthu(LCB);
        this.set_phantram_hoahong(hesoluong);
    }//END NV_KINHDOANH (String HoTen, String DiaChi, String GioiTinh, int LCB, double hesoluong, int SoNam_CongTac, int doanhthu, double phantram_hoahong)
    
    
    /**
     * Phương thức khởi tạo và tính tiền thưởng của nhân viên kinh doanh
     * @return double
     */
    public double f_thuong () {
        double thuong=0;
        return thuong=this.get_doanhthu()*this.get_phantram_hoahong();
    }//END f_thuong
    
    /**
     * Phương thức khởi tạo và tính lương của nhân viên kinh doanh
     * @return double
     */
    public double f_luong () {
        double luong=0;
        return luong=this.LCB+this.f_thuong();
    }//END f_luong ()
    
    /**
     * Phương thức trả về nhân viên kinh doanh
     * @return String
     */
    public String get_Name() {
        return "Nhân viên Kinh Doanh";
    }//END get_Name
}
