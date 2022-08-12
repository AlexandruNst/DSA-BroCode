package _11_Insertion_Sort;

public class Main {
    public static void main(String[] args) {

        // INSERTION SORT = take a target element and insert it in it's correct relative postion
        // look at elements to its left, and shift elements that are bigger to the right
        // stop when we find a smaller value, and insert right after it
        // the subarray to the left is always sorted

        // Time: O(n^2)
        // Best case though can be O(n) compared to Selection Sort O(n^2)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }

    private static void insertionSort(int[] array) {
        // STARTS AT 1 !!!
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
