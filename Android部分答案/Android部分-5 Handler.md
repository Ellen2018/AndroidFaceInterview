### 2.5 Handler

- 1.子线程一定不能更新UI吗？

> 这个问题要回答2个要点：  
> 第1个要点：是否有些控件支持在子线程更新UI呢？  
> 第2个要点：在Activity的onResume()生命周期函数之前是可以在子线程中更新UI的。

- 2.给我说说Handler的原理。

> [点击查看答案](https://www.cnblogs.com/huhx/p/handlerTheory.html)

- 3.Handler导致的内存泄露你是如何解决的？

> **Handler导致内存泄漏的原因是**：非静态内部类持有外部类的引用，导致外部类在没有被使用的时候，迟迟不能被回收，从而导致内存泄漏。即非静态Handler内部类持有外部Activity的引用，导致外部Activity退出/销毁的时候，它迟迟不能被回收，最终导致Activity的内存泄漏。  
> **解决方法**：将Handler类声明为静态，如果Handler需要访问外部类Activity的成员变量或者成员方法，可以用弱引用的方式解决。

- 4.如何使用Handler让子线程和子线程通信？
- 5.你能给我说说Handler的设计原理？

> [4~5题答案](https://blog.csdn.net/ClAndEllen/article/details/79343538)

- 6.HandlerThread是什么 & 原理 & 使用场景？

> [点击查看答案](https://blog.csdn.net/ClAndEllen/article/details/79346492)

- 7.IdleHandler是什么 & 原理？

> [点击查看答案](https://www.jianshu.com/p/a1d945c4f5a6)