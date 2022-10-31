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
public class QL_HINH {
    //Các thuộc tính (thành phần dữ liệu của lớp )
   private int n; // Số lượng hình (đối tượng hình )
    private SHAPE [] A; 
    
    //Các phương thức
    /**
     * Phương thức khởi tạo không tham số
     */
    public QL_HINH () {
        this.n=0;
        this.A = new SHAPE[1000];
    }//END QL_HINH ()
    
    /**
     * Phương thức nhập từng hình (đối tượng)
     */
    public void Nhap() {
        A[n] = new Point();
        this.n++;
        
        
        A [n] = new Point(2, 3);
        this.n++;
        
        A [n] = new Circle(1,5,5);
        this.n++;
        
        A [n] = new Cylinder(3, 2, 10, 20);
        this.n++;
    }//END Nhap ()
    
    public void Xuat() {
        //Xuất
         for (int i=0; i<this.n; i++) //Không nên chạy đến length vì sẽ nó chạy đến 100
        {
            System.out.println(A[i].getName() +":" +A[i] + A[i].area() +A[i].volume()); 
        }
    }
    
    public double f_TongTT () {
        
        double V=0;
         for (int i=0; i<this.n; i++) //Không nên chạy đến length vì sẽ nó chạy đến 100
        {
           V += A[i].volume(); 
        }
         return V;
    }
}
