package _15_Hash_Table;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        // HASHTABLES = DS that stores unique keys to values (i.e. entries)
        //              FAST insertion, lookup, deletion
        //              not ideal for small data sets, great on large data sets

        // hashing    = takes a key and computes an integer (based on a specific formula)
        //              in a hashtable, we use hash % capacity to calculate index number

        //              key.hashCode() % capacity = index (or bucket)

        // bucket     = an indexed storage for 1 or more entries
        //              in case of collision, we treat each bucket as a linked list

        // collision  = hash function generates the same index for more than one key
        //              less collisions means more efficiency

        // T: Best case (no collisions) O(1)
        //    Worst case (all entries collide) O(n) (it's just a LinkedList)

        Hashtable<Integer, String> table = new Hashtable<>(10);
        // default capacity is 11 nad load factor is 0.75
        // i.e. size will dynamically increase when 75% of the table is full
        // Can modify these by the following:
        // Hashtable<Integer, String> table = new Hashtable<>(10, 0.5f);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        for(Integer key : table.keySet()){ //Integer because of the .hashCode() method
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

        System.out.println("/////////");

        Hashtable<String, String> tableString = new Hashtable<>(21);

        tableString.put("100", "Spongebob");
        tableString.put("123", "Patrick");
        tableString.put("321", "Sandy");
        tableString.put("555", "Squidward");
        tableString.put("777", "Gary");

        for(String key : tableString.keySet()){ //Integer because of the .hashCode() method
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + tableString.get(key));
        }
    }
}
