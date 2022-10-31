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
public class NGUYENKIM extends CUAHANG{
    //Thuộc tính
    protected String DiaChi; //Địa chỉ cửa hàng
    protected int SoLuong_NhanVien; //Số lượng nhân viên trong cửa hàng
    protected int Ma_CuaHang; //Mã cửa hàng
    protected int SoLuong_MayLanh; //Số lượng máy lạnh trong cửa hàng
    protected int Gia_MayLanh=3000000; //Giá của máy lạnh
    protected int MA_LOAI; //Mã loại máy lạnh
    protected int SoLuong_Ban; //Số lượng bán 
    protected int tien_cong_nhanvien=6000000; //Số tiền công cho 1 nhân viên
    
    
    
    /**
     * Phương Thức thiết lập địa chỉ cửa hàng
     * @param address String
     */
   public void set_DiaChi (String address) {
       this.DiaChi=address;
   }//END set_DiaChi (String address)
   
   /**
    * Phương thức trả về thông tin địa chỉ
    * @return 
    */
   @Override
   public String get_DiaChi () {
       return this.DiaChi;
   }//END get_DiaChi ()
    
   /**
    * Phương thức thiết lập số lượng nhân viên
    * @param SLNV int
    */
   public void set_SoLuong_NhanVien (int SLNV) {
       this.SoLuong_NhanVien=SLNV;
   }//END set_SoLuong_NhanVien (int SLNV)
   
   /**
    * Phương thức trả về số lượng nhân viên
    * @return int
    */
   @Override
   public int get_SoLuong_NhanVien () {
       return this.SoLuong_NhanVien;
   }//END get_SoLuong_NhanVien ((
   
   /**
    * Phương thức thiết lập mã cửa hàng
    * @param MaShop int
    */
   public void set_Ma_CuaHang (int MaShop) {
       this.Ma_CuaHang=MaShop;
   }//END set_Ma_CuaHang (int MaShop)
   
   /**
    * Phương thức trả kết quả mã của cửa hàng
    * @return int
    */
   @Override
   public int get_Ma_CuaHang () {
       return this.Ma_CuaHang;
   }//END get_Ma_CuaHang()
   
   /**
    * Phương thức thiết lập số lượng máy lạnh của cửa hàng
    * @param SOLUONG int
    */
   public void set_SoLuong_MayLanh (int SOLUONG) {
       this.SoLuong_MayLanh=SOLUONG;
   }//END set_SoLuong_MayLanh (int SOLUONG)
   
   /**
    * Phương thức lấy số lượng máy lạnh của cửa hàng
    * @return int
    */
   @Override
   public int get_SoLuong_MayLanh () {
       return this.SoLuong_MayLanh;
   }//END get_SoLuong_MayLanh ()
   
   /**
    * Phương thức thiết lập mã loại cho máy lạnh
    * @param MALOAI int
    */
   public void set_MA_LOAI (int MALOAI) {
       this.MA_LOAI=MALOAI;
   }//END set_MA_LOAI (MALOAI)
   
   /**
    * Phương thức trả về mã của máy lanh
    * @return int
    */
   @Override
   public int get_MA_LOAI () {
       return this.MA_LOAI;
   }//END get_MA_LOAI()
   
   /**
    * Phương thức cài đặt số lượng bán cho cửa hàng
    * @param SLBAN int
    */
   public void set_SoLuong_Ban (int SLBAN) {
      if(SLBAN>this.get_SoLuong_MayLanh()) {
          this.SoLuong_Ban=0;
      }
      else {
          this.SoLuong_Ban=SLBAN;
      }
   }//END set_SoLuong_Ban (int SLBAN)
   
   /**
    * Phương thức trả về kết quả số lượng bán của cửa hàng
    * @return int
    */
   @Override
   public int get_SoLuong_Ban () {
       return this.SoLuong_Ban;
   }
   /**
    * Phương thức trừu tượng khuyến mãi sẽ được cập nhập bên lớp DIENMAYCHOLON
    * @return int
    */
   @Override
   public int f_khuyenmai () {
       return 0;
   }//END f_khuyenmai ()
   
   /**
    * Phương thức trừu tượng chi phí sản xuất sẽ được cập nhập bên lớp FPTSHOP
    * @return int
    */
   @Override
   public int f_chiphisanxuat () {
       return 0;
   }//END f_chiphisanxuat
   
   /**
    * Phương thức khởi tạo 0 tham số
    */
   public NGUYENKIM () {
       this.DiaChi="689 điện biên phủ, bình thạnh";
       this.SoLuong_NhanVien=10;
       this.Ma_CuaHang=472;
       this.SoLuong_MayLanh=40;
       this.MA_LOAI=200;
       this.SoLuong_Ban=80;
   }//END NGUYENKIM
   
   /**
    * Phương thức khởi tạo 6 tham số NGUYENKIM
    * @param DiaChi String
    * @param SoLuong_NhanVien int
    * @param Ma_CuaHang int
    * @param SoLuong_MayLanh int
    * @param MA_LOAI int
    * @param SoLuong_Ban int 
    */
   public NGUYENKIM (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban) {
       this.set_DiaChi(DiaChi);
       this.set_SoLuong_NhanVien(MA_LOAI);
       this.set_Ma_CuaHang(MA_LOAI);
       this.set_SoLuong_MayLanh(SoLuong_Ban);
       this.set_MA_LOAI(MA_LOAI);
       this.set_SoLuong_Ban(MA_LOAI);
   }//END NGUYENKIM (String DiaChi, int SoLuong_NhanVien, int Ma_CuaHang, int SoLuong_MayLanh, int MA_LOAI, int SoLuong_Ban)
   
   
   
   /**
    * Phương thức tính tiền vốn đầu tư của cửa hàng Nguyên Kim
    * @return int
    */
   @Override
   public int f_tienvon () {
       int tienvon=0;
       return tienvon=(this.tien_cong_nhanvien*this.get_SoLuong_NhanVien());
   }//END f_tienvon ()
   

   
   
   /**
    * Phương thức tổng doanh thu của cửa hàng Nguyên Kim
    * @return int
    */
   @Override
   public int f_doanhthu () {
       int doanhthu=0;
       return doanhthu=(this.get_SoLuong_Ban()*this.Gia_MayLanh);
   }//END f_doanhthu()
   
   /**
    * Phương thức tính lợi nhuận của cửa hàng Nguyên Kim
    * @return int
    */
   @Override
   public int f_LoiNhuan () {
       int loinhuan=0;
       return loinhuan=this.f_doanhthu()-this.f_tienvon();
   }//END f_loinhuan()
   
   /**
    * Phương thức trả về tên Nguyên Kim
    * @return String
    */
   @Override
   public String getname () {
       return "Nguyên Kim";
   }//END getname()
   
   /**
    * Phương thức trả ra thông tin cửa hàng 
    * @return String
    */
   @Override
   public String toString () {
       String STR;
       return STR="" +this.getname() + "Tiền vốn" +this.f_tienvon() + "doanh thu là:"+ this.f_doanhthu() + "lợi nhuận"+ this.f_LoiNhuan();
   }//END toString
 }
