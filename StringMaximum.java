package com;

import java.util.Scanner;

public class StringMaximum {
    public static void main(String[] args) {
        String[] stringArr = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 strings");
        for(int i=0; i< stringArr.length; i++)
            stringArr[i] = sc.next();

        String max = stringArr[0];

        for(int i=0; i<stringArr.length; i++){
            if(max.compareTo(stringArr[i]) < 0)
                max = stringArr[i];
        }

        System.out.println("maximum string = " + max);

    }

}