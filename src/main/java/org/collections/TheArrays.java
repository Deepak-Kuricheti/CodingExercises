package org.collections;

import java.util.Arrays;

public class TheArrays {

    static void main(String[] args) {



//        Array is older collection before collection intoduced in java.
//        Array is of fixed size used to store multiple values of same type.
//        we should always know the size before working on arrays as its not flexible
//        we cant add of remove elements in array
//        Arrays works on primitive types where as collection works on wrapper classses(objects)
//        Arrays are still used in cases where performance needs to be faster as it can access elements faster
//        same is not the case with collection sie collection is slower compared to arrays.

          String[] colors = new String[5];
          colors[0] = "red";
          colors[1] = "green";
          colors[2] = "blue";
          colors[3]= "yellow";
          colors[4] = "violet";

          System.out.println(colors[0]);
          System.out.println(Arrays.toString(colors));

    }
}
