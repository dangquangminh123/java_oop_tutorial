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
public class Point extends SHAPE{
    protected int x; //Tọa độ x
    protected int y; //Tọa độ y
    
    /**
     * Phương thức khởi tạo không tham số
     */
    public Point() {}
    
    /**
     * Phương thức khởi tạo 2 tham số Tọa độ x và tọa độ y
     * @param x int
     * @param y int
     */
    public Point (int x, int y) {
        this.setPoint(x, y);
}//End Point (int x, int y)
    
    /**
     * Phương thức thiết lập tọa độ x và y
     * @param x int 
     * @param y int
     */
    public void setPoint (int x, int y) {
        this.x=x;
        this.y=y;
    }//END setPoint (int x, int y)
    
    /**
     * Phương thức lấy giá trị tọa độ x
     * @return int
     */
    public int getX () {
        return x;
    }//END getX
    
    /**
     * Phương thức lấy giá trị tọa độ Y
     * @return 
     */
    public int getY () {
        return y;
    }//END getY
    
    /**
     * Phương thức trừu tượng area
     * @return
     */
    @Override
    public double area (){
        return 0.0;
    }
    //END area
    
    /**
     * Phương thức trừu tượng volume
     * @return 
     */
    @Override
    public double volume () {
        return 0.0;
    }
    //END volume
    
    
    /**
     * Phương thức in ra màn hình thong tin point
     * @return String
     */
    @Override
    public String toString () {
        String str="Hình" + "tọa độ"+getX() +getY();
        return str;
    }//END String toString()
    
    /**
     * Phương thức hiển thị thông tin của point
     * @return String
     */
    @Override
    public  String getName () {
        String st= "Tên hình"+"Tọa độ x"+this.getX()+"y"+this.getY();
        return st;
    }
            
}

