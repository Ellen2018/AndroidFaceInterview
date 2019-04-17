### 2.7 Fragment

- 1.Android中v4包下Fragment和app包下Fragment的区别是什么？

> [点击查看答案](https://www.cnblogs.com/as3lib/p/6129313.html)

- 2.Fragment的生命周期 & 请结合Activity的生命周期再一起说说。

> [点击查看答案](https://blog.csdn.net/clandellen/article/details/79269680)

- 3.说说Fragment如何进行懒加载。

> [点击查看答案](https://www.cnblogs.com/dasusu/p/6745032.html)

- 4.ViewPager + Fragment结合使用会出现内存泄漏吗 & 如何解决？

> **原因:**一般ViewPager + Fragment结合使用出现内存泄漏的原因可能用某个集合存储了Fragment的实例,导致当用户滑动ViewPager的时候，某一个Fragment即将面临销毁的时候，由于这个集合持有的它的引用，因此不能被回收掉,如果Fragment里面有大量的数据占据内存，有可能会导致OOM。  
> **解决方法**：尽量不要使用集合来存储Fragment实例对象，除非你有良好的二次封装。再就是要做好每一页Fragment的数据缓存问题。

- 5.Fragment如何和Activity进行通信 & Fragment之间如何进行通信？
- 6.给我谈谈Fragment3种切换的方式以及区别 & 使用场景。

> [5~6题答案](https://blog.csdn.net/clandellen/article/details/79269680)

- 7.getFragmentManager,getSupportFragmentManager,getChildFragmentManager之间的区别？

> [点击查看答案](https://blog.csdn.net/Allan_Bst/article/details/64920076)

- 8.FragmentPagerAdapter和FragmentStatePagerAdapter区别？

> [点击查看答案](https://www.cnblogs.com/nbls/p/7252307.html)