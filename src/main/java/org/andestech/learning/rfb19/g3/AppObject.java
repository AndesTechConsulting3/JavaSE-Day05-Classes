package org.andestech.learning.rfb19.g3;

class A2 implements Cloneable
{
    int data;
    public A2(int data){this.data = data;}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class AppObject {



    public static void main(String[] args) throws CloneNotSupportedException
    {
        A2 a = new A2(22);
        A2 a2 = (A2) a.clone();

        System.out.println(a);
        System.out.println(a2);



    }
}
