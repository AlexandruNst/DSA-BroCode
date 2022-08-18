package _12_Recursion;

public class Main {
    // recursion = when a thing is defined in terms of itself.
    //             a recursive method calls itself to solve a smaller problem
    // Advantages: easier to read/write; easier to debug
    // Disadvantages: sometimes slower; uses more memory (many recursive calls => stack overflow)
    // every step is another call pushed onto the Call Stack!

    public static void main(String[] args) {
        walkIterative(5);
        walkRecursive(5);

        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    // Iterative
    private static void walkIterative(int steps) {
        for(int i = 0; i < steps; i++){
            System.out.println("You take a step iteratively.");
        }
    }

    private static void walkRecursive(int steps) {
        if(steps < 1) return; //base case
        System.out.println("You take a step recursively.");
        walkRecursive(steps - 1);
    }

    private static int factorial(int num) {
        if(num < 1) return 1; //base case
        return num * factorial(num - 1); //recursive case
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1; //base case
        return base * power(base, exponent - 1); //recursive step
    }


}
