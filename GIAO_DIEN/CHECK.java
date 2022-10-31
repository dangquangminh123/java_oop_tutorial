/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GIAO_DIEN;

/**
 *
 * @author DELL
 */
public class CHECK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      QL_HINH q1= new QL_HINH();
      q1.Nhap();
      q1.Xuat();
    
        System.out.println("Tổng thể tích"+q1.f_TongTT());
}
}
