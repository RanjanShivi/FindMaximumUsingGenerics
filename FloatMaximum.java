package com;

import java.util.Scanner;

public class FloatMaximum {
    public static void main(String[] args) {
        Float[] floatArr = new Float[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 float numbers");
        for(int i=0; i< floatArr.length; i++)
            floatArr[i] = sc.nextFloat();

        Float max = floatArr[0];

        for(int i=0; i<floatArr.length; i++){
            if(max.compareTo(floatArr[i]) < 0)
                max = floatArr[i];
        }

        System.out.println("maximum float number = " + max);

    }

}


