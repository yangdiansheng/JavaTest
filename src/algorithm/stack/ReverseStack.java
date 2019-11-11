package algorithm.stack;

import java.util.Stack;

/**
 * 逆序一个栈，只能用栈和递归的方式
 * 比如依次压入栈 1，2，3，4，5，栈顶到栈低分别为5,4,3,2,1
 * 逆序后栈顶到栈底为1,2,3,4,5
 *
 */
public class ReverseStack {

    //1,递归函数一，将栈stack的栈底元素返回并删除
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty()){
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    //2,递归函数二，逆序一个栈
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        StackUtil.printStack(stack);
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        reverse(stack2);
        StackUtil.printStack(stack2);
    }

}

