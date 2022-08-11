package _05_ArrayList_DynamicArrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Advantages:
        // 1. Random access of elements in O(1)
        // 2. Good locality of reference and cache utilisation (because the memory addresses are contiguous)
        // 3. Easy to insert/delete at end (closer to head, longer it takes, up to O(n))

        // Disadvantages:
        // 1. Wastes more memory (can have capacity 2 * size and not be used entirely)
        // 2. Shifting elements (insert, delete) takes O(n)
        // 3. Expanding/shrinking takes O(n)

        ArrayList<String> arrayList = new ArrayList<>(); //Java default

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.details();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.details();

        dynamicArray.insert(0, "X");
        dynamicArray.details();

        dynamicArray.delete("A");
        dynamicArray.details();

        System.out.println("C is at index: ");
        System.out.println(dynamicArray.search("C"));
        System.out.println();

        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");
        dynamicArray.add("K");
        dynamicArray.add("L");

        dynamicArray.details();

        dynamicArray.delete("D");
        dynamicArray.delete("E");
        dynamicArray.delete("F");
        dynamicArray.delete("G");
        dynamicArray.delete("H");
        dynamicArray.delete("I");

        dynamicArray.details();

    }
}
