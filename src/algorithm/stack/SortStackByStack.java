package algorithm.stack;

import java.util.Stack;

/**
 * 用一个栈实现列一个栈的排序 栈顶到栈底从小到大排序 只许申请一个栈
 */
public class SortStackByStack {

    public static void sort(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(2);
        stack.push(7);
        stack.push(9);
        StackUtil.printStack(stack);
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(6);
        stack2.push(2);
        stack2.push(7);
        stack2.push(9);
        SortStackByStack.sort(stack2);
        StackUtil.printStack(stack2);
    }

}
