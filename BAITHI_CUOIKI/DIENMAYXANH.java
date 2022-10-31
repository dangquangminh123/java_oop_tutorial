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
public class DIENMAYXANH extends DIENMAYCHOLON {
    protected int soluong_chinhanh; //Số lượng chi nhánh nhỏ của cửa hàng
    
    /**
     * Phương thức thiết lập số lượng chi nhánh của cửa hàng
     * @param SLCN int
     */
    public void set_soluong_chinhanh (int SLCN) {
        if(SLCN<0) {
            this.soluong_chinhanh=0;
        }
        else {
            this.soluong_chinhanh=SLCN;
        }
    }//END set_soluong_chinhanh (int SLCN)
    
    /**
     * Phương thức trả về số chi nhánh của cửa hàng
     * @return int
     */
    public int get_soluong_chinhanh () {
        return this.soluong_chinhanh;
    }//END get_soluong_chinhanh()
    
    /**
     * Phương thức khởi tạo không tham số Cửa Hàng Điện Máy Xanh
     */
    public DIENMAYXANH () {
        super();
        this.soluong_chinhanh=3;
    }//END DIENMAYXANH()
    
    /**
     * Phương thức khởi tạo 8 tham số của cửa hàng Điện Máy Xanh
     * @param DiaChi String
     * @param SoLuong_NhanVien int
     * @param Ma_CuaHang int
     * @param SoLuong_MayLanh int
     * @param MA_LOAI int
     * @param SoLuong_Ban int
     * @param NGAYSINH_CUAHANG int
     * @param soluong_chinhanh int
     */
    public DIENMAYXANH (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban, 
            int NGAYSINH_CUAHANG, int soluong_chinhanh) {
        super(DiaChi, SoLuong_NhanVien, Ma_CuaHang, SoLuong_MayLanh, MA_LOAI, SoLuong_Ban, NGAYSINH_CUAHANG);
        this.get_soluong_chinhanh();
    }//END DIENMAYXANH (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban,int NGAYSINH_CUAHANG, int soluong_chinhanh)
    
    /**
    * Phương thức trừu tượng chi phí sản xuất
    * @return int
    */
    @Override
   public int f_chiphisanxuat () {
       return 0;
   }//END f_chiphisanxuat ()
   
    /**
     * Phương thức tính tổng toàn bộ tiền vốn của các chi nhánh cửa hàng Điện Máy Xanh
     * @return int
     */
    @Override
    public int f_tienvon () {
        //Tổng toàn bộ tiền vốn của tất cả chi nhánh Điện máy xanh
        int tienvon=0;
        return tienvon=super.f_tienvon()*this.get_soluong_chinhanh();
    }//END f_tienvon ()
    
    /**
     * Phương thức tính tổng giá trị khuyến mãi của toàn chi nhánh Điện Máy Xanh
     * @return int
     */
    @Override
    public int f_khuyenmai () {
        //Giả sử chính sách khuyến mãi của các chi nhánh đều như nhau và tính tổng giá trị khuyến mãi của toàn chi nhánh
        int GTKM_TB=0;
        return GTKM_TB=super.f_khuyenmai()*this.get_soluong_chinhanh();
    }//END f_khuyenmai (int NGAYS_CCN)
    
    /**
     * Phương thức tính tổng doanh thu toàn bộ các chi nhánh
     * @return int
     */
    @Override
    public int f_doanhthu () {
        //Giả sử mỗi chi nhánh đều như nhau về số lượng bán và chính sách khuyến mãi và cùng ngày sinh
        int revenue=0;
        return revenue= super.f_doanhthu()*this.get_soluong_chinhanh();
    }//END f_doanhthu()
    
    /**
     * Phương thức tính tổng lợi nhuận của toàn bộ các cửa hàng Điện Máy xanh trên toàn quốc
     * @return int
     */
    @Override
    public int f_LoiNhuan () {
        //Tổng toàn bộ lợi nhuận
        int profit=0;
        return profit= super.f_LoiNhuan()*this.get_soluong_chinhanh();
    }//END f_LoiNhuan ()
    
    /**
     * Phương thức cho biết tên cửa hàng là Điện Máy Xanh
     * @return String
     */
    @Override
    public String getname () {
        return "DIENMAYXANH";
    }//END getname
    
    /**
     * Phương thức trả ra thông tin cửa hàng Điện Máy Chợ Lớn
     * @return String
     */
    @Override
    public String toString () {
        String ST;
        return ST= super.toString() + "Số Lượng Chi Nhánh là" +this.get_soluong_chinhanh();
    }//END toString ()
}
