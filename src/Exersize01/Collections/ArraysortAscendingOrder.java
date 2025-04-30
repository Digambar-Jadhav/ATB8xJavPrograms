package Exersize01.Collections;

import java.util.Arrays;

public class ArraysortAscendingOrder {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {9,8,7,6,5,4,3,2,1};

        Arrays.sort(numbers);
        System.out.println("Sorted Array is");
        for(int num:numbers){
            System.out.print(num+" ");
        }
    }
}