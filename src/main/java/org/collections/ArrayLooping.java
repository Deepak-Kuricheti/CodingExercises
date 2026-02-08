package org.collections;

public class ArrayLooping {

     static void main(String[] args) {

        String[] colors = {"blue", "red", "green", "yellow", "purple", "orange"};

        //normal order
        System.out.println(colors.length);
        for(int i =0; i<colors.length;i++){
            System.out.println(colors[i]);
        }

        //reverse order
        for(int i =colors.length-1;i>=0;i--){
            System.out.println(colors[i]);
        }
       //enhanced for loop
        for(String a : colors){
            System.out.println(a);
        }
    }
}
