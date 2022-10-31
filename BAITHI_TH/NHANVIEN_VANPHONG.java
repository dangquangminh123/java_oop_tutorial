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
public class NHANVIEN_VANPHONG extends DV_SX {
    protected String HoTen; //họ và tên nhân viên
    protected String DiaChi; //Địa chỉ nhân viên
    protected String GioiTinh; //Giới tính nhân viên
    protected int LCB=9500000; //Lương cơ bản của nhân viên
    protected double hesoluong; //Hệ số lương
    protected int SoNam_CongTac; //Số năm công tác
    
    /**
     * Phương thức thiết lập họ tên nhân viên
     * @param HT String
     */
    public void set_HoTen (String HT) {
        this.HoTen=HT;
    }//END set_HoTen (String HT)

    /**
     * Phương thức trả về họ tên nhân viên
     * @return String
     */
    public String get_HoTen () {
        return this.HoTen;
    }//END get_HoTen ()
    
    /**
     * Phương thức thiết lập địa chỉ nhân viên
     * @param Address String
     */
    public void set_DiaChi(String Address) {
        this.DiaChi=Address;
    }//END set_DiaChi (String Address)
    
    /**
     * Phương thức trả về địa chỉ nhân viên
     * @return String
     */
    public String get_DiaChi() {
        return this.DiaChi;
    }//END get_DiaChi ()
    
    /**
     * Phương thức thiết lập giới tính nhân viên
     * @param GT String
     */
    public void set_GioiTinh (String GT) {
        this.GioiTinh=GT;
    }//END set_GioiTinh (String GT)
    
    /**
     * Phương thức lấy giới tính nhân viên
     * @return String
     */
    public String get_GioiTinh() {
        return this.GioiTinh;
    }//END get_GioiTinh()
    
    /**
     * Phương thức thiết lập hệ số lương
     * @param HSL double
     */
    public void set_hesoluong (double HSL) {
        if(HSL<0) {
            this.hesoluong=0;
        }
        else
        this.hesoluong=HSL;
    }//END set_hesoluong (double HSL)
    
    /**
     * Phương thức lấy giá trị hệ số lương
     * @return double
     */
    public double get_hesoluong () {
        return this.hesoluong;
    }//END get_hesoluong ()
    
    /**
     * Phương thức thiết lập số năm công tác của nhân viên
     * @param SNCT int
     */
    public void set_SoNam_CongTac (int SNCT) {
        this.SoNam_CongTac=SNCT;
    }//END set_SoNam_CongTac (int SNCT)
    
    /**
     * Phương thức trả về giá trị số năm công tác của nhân viên
     * @return int
     */
    public int get_SoNam_CongTac() {
        return this.SoNam_CongTac;
    }//END get_SoNam_CongTac ()
    
    /**
     * PHương thức khởi tạo 0 tham số
     */
    public NHANVIEN_VANPHONG() {
        this.HoTen="Đặng Quang Minh";
        this.GioiTinh="Nam";
        this.DiaChi="12 trịnh đình thảo";
        this.hesoluong=1.5;
        this.SoNam_CongTac=2;
    }//END NHANVIEN_VANPHONG ()
    
    
    /**
     * Phương thức khởi tạo 5 tham số
     * @param HoTen String
     * @param DiaChi String
     * @param GioiTinh String
     * @param SoNam_CongTac int
     */
    public NHANVIEN_VANPHONG (String HoTen, String DiaChi, String GioiTinh,double hesoluong, int SoNam_CongTac){
        this.set_HoTen(HoTen);
        this.set_DiaChi(DiaChi);
        this.set_GioiTinh(HoTen);
        this.set_hesoluong(hesoluong);
        this.set_SoNam_CongTac(LCB);
      }//END NHANVIEN_VANPHONG(String HoTen, String DiaChi, String GioiTinh,double hesoluong, int SoNam_CongTac)
    
    /**
     * Phương thức khởi tạo và tính giá trị của phụ cấp
     * @return double
     */
    public double f_phucap() {
        double phucap=0;
        if(this.get_SoNam_CongTac()<10) {
            phucap=1*this.LCB;
        }
        else {
            phucap=1.2*this.LCB;
        } 
        return phucap;
    }//END f_phucap()
    
    /**
     * Phương thức tính lương nhân viên văn phòng
     * @return 
     */
    public double f_luong () {
        double luong=0;
        return luong=this.get_hesoluong()*this.LCB+this.f_phucap();
    }//END f_luong
    
    /**
     * Phương thức trả về nhân viên văn phòng 
     * @return String
     */
    public String get_Name () {
        return "Nhân viên Văn Phòng";
    }//END get_Name
}
