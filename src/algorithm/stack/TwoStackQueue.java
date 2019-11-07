package algorithm.stack;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 * 注意
 * 1，必须一次性将push栈内容压入pop栈
 * 2，如果pop栈不为空决不能像pop栈压入数据
 */
public class TwoStackQueue {
    private static Stack<Integer> pushStack = new Stack<>();//压入栈
    private static Stack<Integer> popStack = new Stack<>();//压出栈

    private static void pushToPop(){
        if (!popStack.isEmpty()){
            while (!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
    }

    public void add(int pushInt){
        pushStack.push(pushInt);
        pushToPop();
    }

    public int poll(){
        if (pushStack.isEmpty() && popStack.isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        pushToPop();
        return popStack.pop();
    }

    public int peek(){
        if (pushStack.isEmpty() && popStack.isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        pushToPop();
        return popStack.peek();
    }
}
