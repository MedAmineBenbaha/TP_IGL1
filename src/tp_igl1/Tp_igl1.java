/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_igl1;

import java.util.Vector;

/**
 *
 * @author mac
 */
public class Tp_igl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector a=new Vector(3);
        a.addElement(10);a.addElement(1);a.addElement(5);
       
        VectorHelper.vectorSort(a);
        System.out.println(a.get(0)+"  ++  "+a.get(1)+"  +++++  "+a.get(2));
      
    }
    
}
