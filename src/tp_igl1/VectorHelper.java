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
final public class VectorHelper {

    /**
     *
     * @param vect
     * @param start
     * @param end
     */
    public void vectorSort(Vector vect,int start,int end){
        int m;
        try{
            if(start<end){
                m = Partition (vect,start,end);
                vectorSort(vect,start,m-1);
                vectorSort(vect,m+1,end);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    int pivot,i,j,k;
    public int Partition (Vector v,int start,int end){

        pivot=v.capacity();
        i=(start-1); // index of the smaller elm
        for(j=start;j<=end-1;j++){
            //If the current elemnt is smaller than (or equal) to pivot
            /*if((v.get(j))<=pivot){
                i++;
                swap(v,i,j);
            }*/
        }
        //swapping ..
        swap(v,i+1,end);
        return i+1;

    }
    public void sum(Vector vector1,Vector vector2){


    }
    
    
    public static void  reverse(Vector v){
        int size=v.capacity();
        int j=size-1;
        int i=0;
        while (j>i){
        swap(v,i,j);
        j--;
        i++;
        }
      }
    public static void swap(Vector v,int i, int j) {
        int tmp =(int) v.get(i);
        v.set(i,v.get(j));
        v.set(j,tmp);
    }

}
