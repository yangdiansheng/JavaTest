package algorithm.stack;

import java.util.Stack;

/**
 * 题目：

 实现一个特殊的栈，在实现栈的基本功能（先进后出）上，再实现返回栈中最小元素的操作

 要求：

 1，pop，push，getMin操作时间复杂度都是O(1)

 2，设计的栈类型可以使用现成的栈结构
 */
public class MinStack {

    private static Stack<Integer> dataStack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();

    public void push(int i){
        if (minStack.isEmpty()){
            minStack.push(i);
        } else {
            if (i <= getMin()){
                minStack.push(i);
            }
        }
        dataStack.push(i);
    }

    public int pop() {
        if (dataStack.isEmpty()){
            throw new RuntimeException("stack is null");
        }
        int value = dataStack.pop();
        if (value == getMin()){
            minStack.pop();
        }
        return value;
    }

    public int getMin() {
        if (minStack.isEmpty()){
            throw new RuntimeException("stack is null");
        }
        return minStack.peek();
    }
}
