package _14_Quick_Sort;

public class Main {
    public static void main(String[] args) {
        // QUICK SORT = moves smaller elements to the left of the pivot
        //              recursively divide array into two paritions

        // T: Best and average O(n log n)
        //    Worst case O(n^2) if array is already sorted (or close to it)
        // S: O(log n) due to recursion (space is taken on the call stack)

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        quickSort(array, 0, array.length - 1);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return; //base case

        int pivot = parition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int parition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        // move all elements smaller than pivot to the left of elements bigger than pivot
        for(int j = start; j < end; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // now all elements start to i (including i) are smaller than pivot
        // put pivot in its place, i.e. i+1
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }


}
