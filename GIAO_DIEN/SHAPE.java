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
public interface SHAPE {
    
    /**
     * Diện tích của hình
     * @return 
     */
    public abstract double area() ;
    
    /**
     * 
     * @return 
     */
    public abstract double volume () ;
    
    /**
     * trừu tượng tên của các hình
     * @return 
     */
    public abstract String getName ();
}
