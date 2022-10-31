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
public class Circle extends Point{
    protected double radius; //Bán kính hình tròn
    
    /**
     * Phương thức khởi tạo không tham số
     */
    public  Circle () {super();}
    
    /**
     * Phương thức khởi tạo 3 tham số
     * @param radius double
     * @param x int 
     * @param y int
     */
    public Circle (double radius, int x, int y) {
        super(x, y);
        this.get_Radius();
        
    }//End Circle (double radius, int x, int y)
    /**
     * Phương thức thiết lập bán kính
     * @param radius double
     */
    public void set_Radius (double Radius) {
        if(Radius<0)
            this.radius=0;
        else
        this.radius=Radius;
    }//END set_Radius (double radius)
    
    /**
     * Phương thức lấy bán kính
     * @return 
     */
    public double get_Radius () {
        return this.radius;
    }//END get_Radius ()
    
    /**
     * Phườn thức tính diện tích hình tròn
     * @return 
     */
    @Override
    public double area () {
        double S =this.radius*this.radius*Math.PI;
        return S;
    }//END area ()
    
    /**
     * Phương thức trả về thông tin hình tròn
     * @return 
     */
    @Override
    public String toString () {
        String str="Tâm"+super.toString()+"Bán kính hình tròn"+this.get_Radius();
        return str;
    }//END String toString ()
    
    /**
     * Phương thức trả về tên hình tròn 
     * @return 
     */
    @Override
    public String getName () {
       
        return "Circle";
    }//END String getName
    
    
    
    
    
}
