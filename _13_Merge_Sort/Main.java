package _13_Merge_Sort;

public class Main {
    public static void main(String[] args) {
        // MERGE SORT = recursively divides an array in 2, sorts them and combined them
        // T: O(n log n)
        // S: O(n)

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int l = 0; //left array
        int r = 0; //right array

        for(int i = 0; i < length; i++){
            if(i < middle){
                leftArray[l] = array[i];
                l++;
            } else {
                rightArray[r] = array[i];
                r++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0; //array
        int l = 0; //leftArray
        int r = 0; //rightArray

        // Check conditions for merging
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
