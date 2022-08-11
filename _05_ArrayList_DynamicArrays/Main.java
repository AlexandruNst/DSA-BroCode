package _05_ArrayList_DynamicArrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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
