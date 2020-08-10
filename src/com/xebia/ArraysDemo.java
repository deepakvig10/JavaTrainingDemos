package com.xebia;


import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args){

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        int[] secondArray = { 9,6,4,5,7,8 };
        System.out.println(Arrays.toString(secondArray));

        Arrays.sort(secondArray);

        System.out.println(Arrays.toString(secondArray));

        System.out.println(secondArray.length);

        System.out.println(Arrays.toString(numbers));

        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;

        System.out.println(Arrays.deepToString(matrix));


        int [][] matrix2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(matrix2));



    }

}
