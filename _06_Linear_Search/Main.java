package _06_Linear_Search;

public class Main {
    public static void main(String[] args) {

//        linear search = Iterate through the collection, one element at a time
        // Time complexity: O(n)

        // Disadvantages: Slow for large data sets

        // Advantages:
        // Fast for small to medium data sets
        // Does NOT require sorting
        // Useful for Data Structures with no random access (e.g. LinkedList)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array, 10);
        if(index != -1){
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found :(");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
