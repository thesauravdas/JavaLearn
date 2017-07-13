package com.saurav;

/**
 * Created by sauravda on 7/12/17.
 */
public class ArrayLocation {
    private double coords [];

    public ArrayLocation(double [] coords){
        this.coords=coords;
    }

    public static void main(String [] args){
        double [] coords = {5.0,0.0};
        ArrayLocation accra= new ArrayLocation(coords);
        coords[0] = 32.9;
        System.out.println(accra.coords[0]);
    }
}
