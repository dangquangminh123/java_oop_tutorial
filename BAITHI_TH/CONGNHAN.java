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
public class CONGNHAN extends NV_KINHDOANH {
    private int SanLuong; //Số sản lượng mà công nhân làm được
    
    /**
     * Phương thức thiết lập Sản Lượng
     * @param SL 
     */
    public void set_SanLuong (int SL) {
        if(SL <0) {
            System.out.println("Số Sản Lượng không hợp lệ");
        }
        else {
            this.SanLuong=SL;
        }
    }//END set_SanLuong (itn SL)
    
    /**
     * Phương thức trả về giá trị sản lượng
     * @return 
     */
    public int get_SanLuong () {
        return this.SanLuong;
    }//END get_SanLuong
    
    /**
     * Phương thức khởi tạo không tham số
     */
    public CONGNHAN () {
        super();
        this.SanLuong=20;
    }//END CONGNHAN()
    
    public CONGNHAN (String HoTen, String DiaChi, String GioiTinh, double hesoluong, int SoNam_CongTac, int SanLuong) {
     super(HoTen, DiaChi, GioiTinh, hesoluong, SoNam_CongTac, SanLuong, hesoluong);
        this.get_SanLuong();
    }//END CONGNHAN (String HoTen, String DiaChi, String GioiTinh, int LCB, double hesoluong, int SoNam_CongTac, int SanLuong)
    
    /**
     * Phương thức khởi tạo và tính tiền thưởng cho công nhân
     * @return double
     */
    public double f_thuong () {
        double thuong=0;
        if(this.get_SanLuong()<1000) {
            thuong=1*this.LCB;
        }
        else {
            thuong=1.5*this.LCB;
        }
        return thuong;
    }//END f_thuong()
    
    /**
     * Phương thức khởi tạo và tính tiền lương của công nhân
     * @return 
     */
    public double f_luong () {
        double luong=0;
        return luong=this.get_hesoluong()*this.LCB+this.f_thuong();
    }//END f_luong()
    
    /**
     * Phương thức trả về Công nhân
     * @return 
     */
    public String get_Name() {
        return "Công Nhân";
    }//END get_Name
}
