package aspect;

/**
 * java 连接点：在面向对象程序中，有一些种类对象发生，是由java语言本身所决定的
 * 连接点组成：方法调用、方法声明、对象实例化、构造子执行、字段引用、常量处理
 *
 * 切点：捕捉这些连接点结构
 * 切点定义包含：分割两部分。左边包括切点的名称和切点的参数，右侧包括切点本身
 * pointcut setter(): target(Point) &&(call(void setX(int)) ||call(void setY(int)));
 *
 * 通知
 * 1，命名切点
 * 2，起名切点
 *
 *
 * thisJoinPoint变量
 * 可用被用来访问静态和动态信息，比如说参数
 */
public class Point {
    private int x,y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
