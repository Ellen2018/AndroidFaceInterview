### 2.4 Service

- 1.什么是Service?
- 2.说说Service的生命周期。
- 3.Service和Thread的区别？

> [1~3答案](https://blog.csdn.net/clandellen/article/details/79276411)

- 4.Android 5.0以上的隐式启动问题及其解决方案。

> [点击查看答案](https://www.cnblogs.com/momoshengxiao/p/6442380.html)

- 5.给我说说Service保活方案。

> [点击查看答案](https://www.cnblogs.com/blosaa/p/9530625.html)

- 6.IntentService是什么 & 原理 & 使用场景。

> [点击查看答案](https://blog.csdn.net/ClAndEllen/article/details/79346624)

- 7.创建一个独立进程的Service应该怎样做？

> [点击查看答案](https://www.jianshu.com/p/4a83becd758e)

- 8.Service和Activity之间如何通信？

> [点击查看答案](http://www.cnblogs.com/codingblock/p/4850299.html)

- 9.说说你了解的系统Service。

> [点击查看答案](https://blog.csdn.net/geyunfei_/article/details/78851024)

- 10.谈谈你对ActivityManagerService的理解。

> [点击查看答案](https://www.cnblogs.com/xingchenkn/p/3637137.html)

- 11.在Activtiy中创建一个Thread和在一个Service中创建一个Thread的区别？

> 这题实际是在考察前台和后台线程,Activity和Service的区别。毫无疑问Activtiy中的线程是前台线程，它的生命周期往往是随着Activity的,Activity销毁的时候，那个线程也应该被销毁，否则就会出现内存泄漏现象。而Service中开启的线程，它是工作在后台的，一般来讲，后台线程的生存期是比较长的。