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
public class CHECK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SHAPE [] A = new SHAPE[5];
        
        A[0] = new Point();
        A [1] = new Cylinder(3, 2, 10, 20);
        A [2] = new Point(2, 3);
        A [3] = new Circle(1, 5, 5);
        A [4] = new Cylinder(1, 1.5, 9, 9);
        
        double t=0;
        for (int i=0; i<A.length; i++)
        {
            t+=A[i].area();
           
            System.out.println(A[i].getName() +": "+ A[i].toString()+ "DT ="+A[i].area()); 
        }
        System.out.println("Tong DT: "+t);
    }
    
}
