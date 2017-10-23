/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_igl1;

import java.util.Vector;

/**
 * class 
 * @author Mohammed Amine Benbaha
 * @author Islem Sayah
 */
final public class VectorHelper {
    /**
     * 
     * @param vect 
     */
    public static void vectorSort(Vector vect){
        int n = vect.size();
	for (int j = 1; j < n; j++) {
		int key = (int) vect.get(j);
		int i = j-1;
		while ( (i > -1) && ( (int)vect.get(i) > key ) ) {
			vect.set(i+1, vect.get(i));
			i--;
		}
		vect.set(i+1,key);
	}
    }
    /**
     * sommer  les deux vecteurs vect1 et vect2
     * s'ils ne sont pas egaux alors elle va donner une exception
     * @param vect1
     * @param vect2
     * @throws DifferentException 
     */
    public static void summermlksdnfgbsdfnbosjfdbglsjbdb(Vector vect1,Vector vect2)throws DifferentException{
        if(vect1.size()!=vect2.size()){
            throw new DifferentException();
        }
        else{
            Vector vect3 = null;
            for (int j = 0; j <vect1.size(); j++) {
		vect3.addElement((int)vect1.get(j)+(int)vect2.get(j));
            }
        }
    }
    /**
     * donner le minimum (min) et le maximum (max)
     * d'un vecteur v
     * @param v le vecteur donner
     * @param max le maximum du vecteur
     * @param min  le minimum du vecteur
     */
    public static void minmax(Vector v,int max ,int min){
        max=min=(int) v.get(0);
        for (int j = 1; j <v.size(); j++){
		if((int)(v.get(j))>max){
                    max=(int) v.get(j);
                }
                if((int)(v.get(j))<min){
                    min=(int)(v.get(j));
                }
        }
    }
    /**
     * inverser le vecteur v 
     * @param v 
     */
    public static void  reverse(Vector v){
        int size=v.capacity();
        int j= size-1;
        int i=0;
        while (j>i){
        swap(v,i,j);
        j--;
        i++;
        }
    
    
    }
    /**
     * inverser deux elements donner i et j d'un vecteur v  
     * @param v le vecteur contient les deux valeur à inverser
     * @param i
     * @param j 
     */
    
    public static void swap(Vector v,int i, int j) {
        int tmp =(int) v.get(i);
        v.set(i,v.get(j));
        v.set(j,tmp);
    }
}
