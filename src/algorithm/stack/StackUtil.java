package algorithm.stack;

import java.util.Stack;

public class StackUtil {

    public static void printStack(Stack<Integer> stack){
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
