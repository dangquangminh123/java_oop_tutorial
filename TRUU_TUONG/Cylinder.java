/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRUU_TUONG;

/**
 *
 * @author DELL
 */
public class Cylinder extends Circle{
    private double height; //Chiều cao hình trụ
    /**
     * Phương thức khởi tạo không tham số
     */
    public Cylinder () {super();}
    
    /**
     * Phương thức khởi tạo 4 tham số
     * @param height double
     * @param radius double
     * @param x int
     * @param y int
     */
    public Cylinder (double height, double radius, int x, int y) {
        super(radius, x, y);
        this.set_height(height);
    }//END Cylinder (double height, double radius, int x, int y)
    
    /**
     * Phương thức thiết lập đường cao hình trụ
     * @param Height 
     */
    public void set_height (double Height) {
       if (Height<0)
           this.height=0;
        else
        this.height=Height;
    }//END set_height (double Height)
    
    /**
     * Phương thức lấy đường cao hình trụ
     * @return 
     */
    public double get_height ()
    {
        return this.height;
    }//END double get_height ()
    
    /**
     * Phương thức tính diện tích toàn phần hình trụ
     * @return double
     */
    @Override
    public double area () {
        double Stp = 2*super.area() +(2*Math.PI*this.radius*this.height);
        return Stp;
    }//End Double area
    
    /**
     * Phương thức tính thể tích hình trụ
     * @return 
     */
    @Override
    public double volume () {
        double V = super.area()*this.height;
        return V;
        
    }//END double volume
    
    /**
     * Phương thức xuất thông tin hình trụ
     * @return 
     */
    @Override
    public String toString () {
        String str= "Tâm hình trụ"+ super.toString() + "Đương cao hình trụ là"+this.height;
        return str;
    }//END String toString ()
    
    /**
     * Phương thức xuất tên hình trụ
     * @return 
     */
    @Override
    public String getName () {
        return "Cylinder";
    }//END String getName()
}
