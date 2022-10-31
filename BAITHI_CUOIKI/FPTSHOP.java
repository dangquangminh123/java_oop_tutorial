/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITHI_CUOIKI;

/**
 *Đặng Quang Minh 
 * @author DELL
 */
public class FPTSHOP extends DIENMAYXANH {
    private int SOLUONG_CONGNHAN; // số lượng công nhân 
    private int tien_cong_CONGNHAN=6500000; //Tiền công của 1 công nhân
    
    /**
     * Phương thức thiết lập giá trị số lượng công nhân trong sản xuất
     * @param SL_CN int
     */
    public void set_SOLUONG_CONGNHAN (int SL_CN) {
        if(SL_CN<0) {
            this.SOLUONG_CONGNHAN=0;
            System.out.println("Số lượng công nhân vừa nhập không hợp lệ");
        }
        else  {
        this.SOLUONG_CONGNHAN=SL_CN;
    }
    }//END set_SOLUONG_CONGNHAN (int SL_CN)
    
    /**
     * Phương thức trả về số lượng công nhân trong sản xuất
     * @return int
     */
    @Override
    public int get_SOLUONG_CONGNHAN () {
        return this.SOLUONG_CONGNHAN;
    }//END get_SOLUONG_CONGNHAN ()
    
    /**
     * Phương thức khởi tạo không tham số cửa hàng FPTSHOP
     */
    public FPTSHOP () {
        super();
        this.SOLUONG_CONGNHAN=20;
    }//END FPTSHOP ()
    
    /**
     * Phương thức khởi tạo 9 tham số cửa hàng FPTSHOP
     * @param DiaChi String
     * @param SoLuong_NhanVien int
     * @param Ma_CuaHang int
     * @param SoLuong_MayLanh int
     * @param MA_LOAI int
     * @param SoLuong_Ban int
     * @param NGAYSINH_CUAHANG int
     * @param soluong_chinhanh int
     * @param SOLUONG_CONGNHA int
     */
    public FPTSHOP (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban, 
            int NGAYSINH_CUAHANG, int soluong_chinhanh, int SOLUONG_CONGNHA) {
        super(DiaChi, SoLuong_NhanVien, Ma_CuaHang, SoLuong_MayLanh, MA_LOAI, SoLuong_Ban, NGAYSINH_CUAHANG, soluong_chinhanh);
        this.get_SOLUONG_CONGNHAN();
    }//END FPTSHOP (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban,  int NGAYSINH_CUAHANG, int soluong_chinhanh, int SOLUONG_CONGNHA)
    /**
     * Phương thức tính tổng chi phí sản xuất máy lạnh của cửa hàng FPT
     * @return 
     */
    @Override
    public int f_chiphisanxuat () {
        int chiphi=0;
        return chiphi=this.tien_cong_CONGNHAN*this.get_SOLUONG_CONGNHAN();
    }//END f_chiphisanxuat ()
    
    /**
     * Phương thức tính tiền vốn của cửa hàng máy lạnh FPT
     * @return 
     */
    @Override
    public int f_tienvon () {
        int funds=0;
        return funds=super.f_tienvon()+this.f_chiphisanxuat();
    }//END f_tienvon()
    
    /**
     * Phương thức tính giá trị khuyến mãi của cửa hàng máy lạnh FPT
     * @return 
     */
    @Override
    public int f_khuyenmai () {
        int khuyenmai=0;
        return khuyenmai=super.f_khuyenmai();
    }//END f_khuyenmai ()
    
    /**
     * Phương thức tính giá trị doanh thu của cửa hàng máy lạnh FPT
     * @return int
     */
    @Override
    public int f_doanhthu () {
        int doanhthu=0;
        return doanhthu=super.f_doanhthu();
    }//END f_doanhthu ()
    
    /**
     * Phương thức tính giá trị Lợi Nhuận của cửa hàng máy lạnh FPT
     * @return int
     */
    @Override
    public int f_LoiNhuan () {
        int loinhuan=0;
        return loinhuan=super.f_LoiNhuan() -this.f_tienvon();
    }//END f_LoiNhuan ()
    
    /**
     * Phương thức trả về tên FPTSHOP
     * @return String
     */
    @Override
    public String getname () {
        return "FPTSHOP";
    }//END getname()
    
    /**
     * Phương thức trả về thông tin của cửa hàng FPTSHOP
     * @return String
     */
    @Override
    public String toString () {
        String TS;
        return TS=super.toString() + "Chi phí sản xuất của cửa hàng là" +this.f_chiphisanxuat();
    }//END toString ()
}
    
    
