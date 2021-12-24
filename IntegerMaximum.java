package com;

import java.util.Scanner;

public class IntegerMaximum {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 integer numbers");
        for(int i=0; i< intArr.length; i++)
            intArr[i] = sc.nextInt();

        Integer max = intArr[0];

        for(int i=0; i<intArr.length; i++){
            if(max.compareTo(intArr[i]) < 0)
                max = intArr[i];
        }

        System.out.println("maximum integer = " + max);

        }

    }
