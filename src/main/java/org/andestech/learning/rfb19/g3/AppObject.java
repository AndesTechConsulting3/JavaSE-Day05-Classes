package org.andestech.learning.rfb19.g3;

class B2{ int data;}

class A2 implements Cloneable
{
    int data;
    public A2(int data){this.data = data;}

    B2 b2;

//    @Override
//protected Object clone() throws CloneNotSupportedException {
//    return super.clone();
//}


    @Override
    protected Object clone() throws CloneNotSupportedException {

        A2 o = new A2(data);
        B2 o2 = new B2(); o2.data = b2.data;
        o.b2 = o2;

        return o;
    }

}


public class AppObject {



    public static void main(String[] args) throws CloneNotSupportedException
    {
        A2 a = new A2(22);
        a.b2 = new B2();
        a.b2.data = 87687;

        A2 a2 = (A2) a.clone();

        System.out.println(a);
        System.out.println(a2);

        System.out.println("---------------------");

        System.out.println("a data=" + a.data + ",a b2 data=" + a.b2.data);
        System.out.println("a2 data=" + a2.data + ",a2 b2 data=" + a2.b2.data);

        System.out.println("---------------------");

        a2.data = 1000;
        a2.b2.data = 2000;
        System.out.println("a data=" + a.data + ",a b2 data=" + a.b2.data);
        System.out.println("a2 data=" + a2.data + ",a2 b2 data=" + a2.b2.data);

    }
}
