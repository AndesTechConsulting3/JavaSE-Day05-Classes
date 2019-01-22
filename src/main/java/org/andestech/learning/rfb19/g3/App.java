package org.andestech.learning.rfb19.g3;

class Datas{ int data1, data2; }
class A{ int data; }
class B extends A{

    private B(){
        //....
        //....
    }

    public static B generateB(){
        //....
        //....
        B b = new B();
        return b;
    }

}
class C extends A{ }
class D extends C{}


public class App
{
    private static void try_swap(int a, int b){

        int c = b;
        b = a;
        a = c;
        System.out.println("swap: a=" + a + ", b=" + b);

    }


    private static void try_swap(A a, A b){

        A c = b;
        b = a;
        a = c;
        System.out.println("swap: a=" + a.data + ", b=" + b.data);

    }

    private static void try_swap2(A a, A b){

        int c = b.data;
        b.data = a.data;
        a.data = c;
       // System.out.println("swap: a=" + a + ", b=" + b);
        System.out.println("swap: a=" + a.data + ", b=" + b.data);

    }

    public static void main( String[] args )
    {
        A a = new A();
        A a5 = a, a6 = a5;

       // B b = (B)a; // принципиально не верно!

     //  B b  = new B();
       B b = B.generateB();
       A a11 = b;

       C c = new C();

       //b = (B)c; // принципиально не верно!
       //c = (C)b; // принципиально не верно!

       int a2=3, b2=13;
       try_swap(a2,b2);
       System.out.println("main: a=" + a2 + ", b=" + b2);

       A data1 = new A(), data2= new A();
       data1.data = 10;
       data2.data = 133;

      // A a = data1;

       try_swap(data1,data2);
       System.out.println("main: a=" + data1.data + ", b=" + data2.data);
        System.out.println("--------------------------------------------");
       try_swap2(data1,data2);
       System.out.println("main: a=" + data1.data + ", b=" + data2.data);

       //----------
        B b3 = B.generateB();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(a);
        testVars(a);
        System.out.println(a);

    }

    private static void testVars(A a1){
        a1.data =87687; // во внешней ссылке данные изменятся

        a1 = new A();

        a1.data =325345; // во внешней ссылке данные НЕ изменятся
        System.out.println(a1);

    }

    private static void testVars2(final A a1){
        a1.data =87687; // во внешней ссылке данные изменятся

        //a1 = new A(); // запрещено для final (константная ссылка)

        a1.data =325345; // во внешней ссылке данные НЕ изменятся
        System.out.println(a1);

    }
}
