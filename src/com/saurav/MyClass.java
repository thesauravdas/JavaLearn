package com.saurav;

/**
 * Created by sauravda on 7/12/17.
 */
public class MyClass
{
    private int a;
    public double b;

    public MyClass(int first, double second)
    {
        this.a = first;
        this.b = second;
    }
    public static void main(String[] args)
    {
        MyClass c1 = new MyClass(10, 20.5);
        MyClass c2 = new MyClass(10, 31.5);
        System.out.println(c1.a + ", " + c1.b);
    }
}