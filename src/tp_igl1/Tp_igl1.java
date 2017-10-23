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
    VectorHelper v=new VectorHelper();
    Vector v1 = new Vector(5);
    int i=0;
    while (i<5){
    v1.addElement(i);
    i++;
    }
    v.reverse(v1);
    i=0;
    while(i<5){
    System.out.println(v1.elementAt(i));
    i++;
    }
    
}
}