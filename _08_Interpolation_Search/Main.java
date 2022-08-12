package _08_Interpolation_Search;

public class Main {
    public static void main(String[] args) {

        // interpolation search = an improvement of binary search best used for uniformly distributed data
        // probes aren't necessarily elements of the array, but could be interpolated from the elements
        // it guesses where the value MIGHT be based on a calculated probe
        // formula just needs to be memorised
        // Average time: O(log(log n))
        // Wost case: O(n) for values that increase exponentially

        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int index = interpolationSearch(array, 256);

        if(index != -1){
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            if(array[probe] == value){
                return probe;
            } else if(array[probe] < value){
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
