门面模式(外观模式)
要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次接口，使得子系统更易于使用

优点
1，减少系统的相互依赖
2，提高了灵活性
3，提高了安全性

缺点
1，不符合开闭原则，对修改关闭，对扩展开放

适用场景
1，为一个复杂的模块或子系统提供一个供外界访问的接口
2，子系统相对独立
3，预防低水平人员带来的风险扩散

注意（一个子系统可以有多个门面）
1，门面已经庞大到不能忍受的程度
2，子系统可以提供不同的访问路径
3，门面不参与子系统内的业务逻辑
