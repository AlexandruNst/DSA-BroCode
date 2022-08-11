package _01_Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // stack = LIFO
        //push() - add to top
        //pop() - remove from top

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.empty());

        System.out.println(stack); //doesn't remove
        stack.pop();
        System.out.println(stack);

        String game = stack.pop();
        System.out.println(game);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search("Doom")); //starts at 1, not 0
    }
}
