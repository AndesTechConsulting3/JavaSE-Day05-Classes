package org.andestech.learning.rfb19.g3;

import java.util.Arrays;
import java.util.Random;

public class AppArrays {

    private static void multArray(double[] data, final double mult)
    {
        if(data == null || (mult<0.9 || mult >1.1)  ) return;
        for(int i =0; i< data.length; i++) data[i] *= mult;
    }


    // 33- 126
    //


    private static int[] genRandomArray(int arrSize, int maxInt)
    {
        int[] arr = new int[arrSize];

      for (int i = 0; i<arrSize; i++ ) arr[i] = new Random().nextInt(maxInt);

        return arr;
    }

    private static double summator(double ... data)
    {
        double summa = 0;

        for(int i =0; i<data.length; i++)
        {
            //summa += data[i];
            summa = summa + data[i];
        }

        return summa;
    }


    public static void main(String[] args)
    {
       int[] array = {1,2,-30,4,5,6,10};

       System.out.println(array[6]);
       System.out.println(array.length);

       for(int i =0; i< array.length; i++) array[i] *= 2;

       System.out.println(Arrays.toString(array));

       System.out.print("[");
       for(int d: array) System.out.print(d  + ", ");
       System.out.println("\b\b]");


        double[] arr = {10,20,30,40,55,68,100};
        multArray(arr, 0.9);
        System.out.println(Arrays.toString(arr));

//-------------------------------------------

        int N = 3;

        String[] starr1 = new String[N];
        starr1[0]="as,jd";
        starr1[1]="AAAA";
        starr1[2]="rtuytu";
// anonymous arrays

        System.out.println(Arrays.toString(
                new int[]{1,2,3,4,56,5}
        ));



        //int[] arr2 = new int[12];

        int[] arr2 = genRandomArray(12, 300);

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(genRandomArray(10,200)));


        System.out.println(summator(1.0,2.0,3.0,4.0,5.0));

    }

}
