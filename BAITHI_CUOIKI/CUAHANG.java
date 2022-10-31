/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITHI_CUOIKI;

/**
 *  Đặng Quang Minh
 * @author DELL
 */
public abstract class CUAHANG {
    
    public String get_DiaChi () {
        return "";
    }
    public int get_SoLuong_NhanVien () {
        return 0;
    }
    public  int get_Ma_CuaHang (){
        return 0;
    }
    public int get_SoLuong_MayLanh () {
        return 0;
    }
    
    public int get_MA_LOAI () {
        return 0;
    }
    
    public int get_SoLuong_Ban () {
        return 0;
    }
    
    public  int get_soluong_chinhanh () {
        return 0;
    }
    
    public int get_NGAYSINH_CUAHANG () {
        return 0;
    }
    
    public int get_SOLUONG_CONGNHAN () {
          return 0;
    }
    public abstract int f_chiphisanxuat ();
    public abstract int f_tienvon();
    public abstract int f_khuyenmai();
    public abstract int f_doanhthu();
    public abstract int f_LoiNhuan();
    public abstract String getname();
    public abstract String toString();
        
    
}
