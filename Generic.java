package com;


import java.util.Scanner;

public class Generic {
    public static <T extends Comparable<T> >
    T findMax( T[] array) {
        T max = array[0];
        for ( int i = 1; i < array.length; i++) {
            if ( max.compareTo(array[i]) < 0 )
                max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter how many parameters you want to enter");
        int numOfParameters = scanner.nextInt();
        System.out.println("Enter type of parameter you want to enter: \n1 for Integer\n2 for Float\n3 for Strings");
        int option = scanner.nextInt();
        Generic generic = new Generic();
        switch (option){
            case 1:
                Integer[] intArr = generic.intArray(numOfParameters);
                findMax(intArr);
                break;
            case 2:
                Float[] floatArr = generic.floatArray(numOfParameters);
                findMax(floatArr);
                break;
            case 3:
                String[] stringArr = generic.stringArray(numOfParameters);
                findMax(stringArr);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }

    Integer[] intArray(int numOfParameters) {
        Integer[] intArr = new Integer[numOfParameters];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter " + numOfParameters + " integer numbers");
        for(int i=0; i< intArr.length; i++)
            intArr[i] = sc.nextInt();
        return intArr;
    }


    Float[] floatArray(int numOfParameters) {
        Float[] floatArr = new Float[numOfParameters];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter " + numOfParameters + " float numbers");
        for(int i=0; i< floatArr.length; i++)
            floatArr[i] = sc.nextFloat();
        return floatArr;
    }


    String[] stringArray(int numOfParameters) {
        String[] stringArr = new String[][numOfParameters];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter " + numOfParameters + " strings");
        for(int i=0; i< stringArr.length; i++)
            stringArr[i] = sc.next();
        return stringArr;
    }

}
