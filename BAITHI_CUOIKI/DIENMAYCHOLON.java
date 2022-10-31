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
public class DIENMAYCHOLON extends NGUYENKIM {
    protected int NGAYSINH_CUAHANG; //Sinh nhật cửa hàng
    
    /**
     * Phương thức thiết lập ngày sinh cửa hàng Điện Máy Chợ Lớn
     * @param NSCH int
     */
    public void set_NGAYSINH_CUAHANG (int NSCH) {
        this.NGAYSINH_CUAHANG=NSCH;
    }//END set_NGAYSINH_CUAHANG (int NSCH)
    
    /**
     * Phương thức trả ra giá trị ngày sinh cửa hàng Điện Máy Chợ Lớn
     * @return 
     */
    @Override
    public int get_NGAYSINH_CUAHANG () {
        return this.NGAYSINH_CUAHANG;
    }//END get_NGAYSINH_CUAHANG()
    
    
    
    /**
     * Phương thức khởi tạo không tham số
     */
    public DIENMAYCHOLON () {
        super();
        this.NGAYSINH_CUAHANG=1907;
    }//END DIENMAYCHOLON()
    
    /**
     * Phương thức khởi tạo 7 tham số
     * @param DiaChi String
     * @param SoLuong_NhanVien int
     * @param Ma_CuaHang int
     * @param SoLuong_MayLanh int
     * @param MA_LOAI int
     * @param SoLuong_Ban int
     * @param NGAYSINH_CUAHANG int 
     */
    public DIENMAYCHOLON (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban, int NGAYSINH_CUAHANG) {
        super(DiaChi, SoLuong_NhanVien, Ma_CuaHang, SoLuong_MayLanh, MA_LOAI, SoLuong_Ban);
        this.set_NGAYSINH_CUAHANG(MA_LOAI);
    }//END DIENMAYCHOLON (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban, int NGAYSINH_CUAHANG)
    
   
    
    /**
     * Phương thức khởi tạo tiền vốn của cửa hàng
     * @return int
     */
    @Override
    public int f_tienvon () {
       int tienvon=0;
       return tienvon=super.f_tienvon();
   }//END f_tienvon ()
    
    /**
     *  Khởi tạo phương thức tính giá trị khuyến mãi sản phẩm cho cửa hàng khi đến ngày sinh cửa hàng
     * @param NGAYSINH
     * @return 
     */
    @Override
    public int f_khuyenmai () {
        int GTKM =0;
        int NGAYSINH=0;
        //Khi đến ngày sinh cửa hàng thì giá của một máy lạnh được giảm giá 30% 
        if(NGAYSINH==this.get_NGAYSINH_CUAHANG()) {
            GTKM=this.Gia_MayLanh*30/100;
        }
        else {
            GTKM=0;
        }
        return GTKM;
    }//END f_khuyenmai (int NGAYSINH)
    
    
    
    /**
     * Phương thức tính doanh thu của cửa hàng Điện Máy Chợ Lớn
     * @return int
     */
    @Override
    public int f_doanhthu () {
        int DT=0;
        DT=super.f_doanhthu()-(this.SoLuong_Ban*this.f_khuyenmai());
        return DT;
    }//END f_doanhthu ()
    
    /**
     * Phương thức tính lợi nhuận của điện máy chợ lớn
     * @return int
     */
    @Override
    public int f_LoiNhuan () {
        int loinhuan=0;
        return loinhuan=this.f_doanhthu()-this.f_tienvon();
    }//END f_loinhuan ()
    
    /**
     * Phương thức cho biết tên cửa hàng là điện máy chợ lớn
     * @return String
     */
    @Override
    public String getname () {
        return "DIENMAYCHOLON";
    }//END getname
    
    /**
     * Phương thức trả ra thông tin cửa hàng Điện Máy Chợ Lớn
     * @return String
     */
    @Override
    public String toString () {
        String ST;
        return ST= super.toString() + "Khuyến mãi là:"+this.f_khuyenmai();
    }//END toString ()
}
