package _07_Binary_Search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // binary search = looks for element in a SORTED array
        //                 half of the array is eliminated at each step

        int[] array = new int[1000000];
        int target = 777777;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        // built-in method

        int index = Arrays.binarySearch(array, target);
        if(index == -1){
            System.out.println(target + " not found :(");
        } else {
            System.out.println(target + " found at " + index);
        }
        
        // our own

        int index2 = binarySearch(array, target);
        if(index2 == -1){
            System.out.println(target + " not found :(");
        } else {
            System.out.println(target + " found at " + index2);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = (low + high) / 2;
            int value = array[middle];

            if(value < target){
                low = middle + 1;
            } else if(value > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
