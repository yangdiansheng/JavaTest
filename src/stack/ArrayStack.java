package stack;

public class ArrayStack {
    private String[] items;//存储数据的数组
    private int count;//栈中的元素
    private int n;//栈的大小

    public ArrayStack(int n){
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    //入栈操作
    public boolean push(String item){
        //如果栈满了返回false，入栈失败
        if (count == n){
            return false;
        }
        //将item放到下标为count的位置，count +1
        items[count] = item;
        //栈中元素+1
        count++;
        return true;
    }

    //出栈操作
    public String pop(){
        //如果栈为空返回null
        if (count == 0){
            return null;
        }
        //返回下标第n-1个元素
        String temp = items[count - 1];
        //元素总数减1
        count--;
        return temp;
    }
}
