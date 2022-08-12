package _09_Bubble_Sort;

public class Main {
    public static void main(String[] args) {

        // BUBBLE SORT = pairs of adjacent elements are compared and swapped if not in order
        // O(n^2) - ok for small data sets, terrible for large data sets

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
