### 2.14 ViewPager

- 1.什么是ViewPager?说说它的那些适配器。

> [点击查看答案](https://blog.csdn.net/ClAndEllen/article/details/82862804)

- 2.你了解ViewPager2吗？和ViewPager 1有哪些区别？

> [点击查看答案](https://blog.csdn.net/weixin_42797048/article/details/88397381)

- 3.ViewPager + Fragment结合使用存在的内存泄漏的原因是什么？如何解决？

> **原因:**一般ViewPager + Fragment结合使用出现内存泄漏的原因可能用某个集合存储了Fragment的实例,导致当用户滑动ViewPager的时候，某一个Fragment即将面临销毁的时候，由于这个集合持有的它的引用，因此不能被回收掉,如果Fragment里面有大量的数据占据内存，有可能会导致OOM。  
> **解决方法**：尽量不要使用集合来存储Fragment实例对象，除非你有良好的二次封装。再就是要做好每一页Fragment的数据缓存问题。
