### 2.36 其它Android部分有关面试题

- 1.说说一个app的启动流程(从源码角度讲解)。

> [点击查看答案](https://www.jianshu.com/p/12de32b31836)

- 2.你知道无论是Kotlin或者是Java,程序运行的主要入口都是main()方法，那么Android的main方法在哪里？

> [点击查看答案](https://www.jianshu.com/p/302fe75d6778)

- 3.Android Hock技术了解吗？

> [点击查看答案](https://www.jianshu.com/p/4f6d20076922)

- 4.简述Android中的加固和使用平台？

> [点击查看答案](https://www.cnblogs.com/baiqiantao/p/9286449.html)

- 5.谈谈你对Apk瘦身的经验？

> [点击查看答案](https://www.jianshu.com/p/bd90dee57ad0)

- 6.为什么子线程不能更新UI？

> [点击查看答案](https://www.cnblogs.com/lao-liang/p/5108745.html)

- 7.你知道如何定位内存泄漏吗？

> [点击查看答案](https://www.cnblogs.com/daqiang5566/p/6145671.html)

- 8.说说System.exit(0),onDestory(),Activity.finish()的区别？

> [点击查看答案](https://www.cnblogs.com/hsqdboke/p/5278671.html)

- 9.在OnResume或者之前获取View的宽高为多少 & 为什么？

> 其宽高为0,因为View绘制过程发生在onResume之后的，也就是说onResume之前，View没有进行绘制，俺么宽高当然为0啊。  
> [参考链接](https://www.jianshu.com/p/1b4a1449adb3)

- 10.Art & Dvm 区别，特别是谈谈GC的区别。 

> [点击查看答案](https://www.cnblogs.com/shaweng/p/3811461.html)
> [GC的区别](https://blog.csdn.net/vivian_king/article/details/80741346)

- 11.说说你用的二维码框架 & 有过优化经验吗？

> [点击查看答案](https://www.jianshu.com/p/9bd4e5d8a405)

- 12.谈谈App多进程的好处 & 缺点。

> [点击查看答案](https://www.cnblogs.com/xuan52rock/p/6491968.html)

- 13.说说AMS是怎么找到启动指定的Activity？

> [点击查看答案](https://www.jianshu.com/p/f5ae1361ec44)

- 14.View的getWidth和getMeasureWidth有啥区别？

> [点击查看答案](https://www.cnblogs.com/summerpxy/p/4983600.html)

- 15.有插件化或者热修复经验吗？说说它的原理。

> [点击查看答案](https://www.jianshu.com/p/704cac3eb13d)

- 16.断点续传了解吗？谈谈你是如何通过多线程实现断点续传的。

> [点击查看答案](https://blog.csdn.net/seu_calvin/article/details/53749776)    
> [多线程断点续传](https://blog.csdn.net/qq_32101859/article/details/53186927)  
> 链接里都是栗子，回答这个题目的时候要回答出多线程断点续传的几个难点，例如如何给那几个子线程分配下载任务的。

- 17.给我谈谈你对SurfaceView的认识。

> [点击查看答案](https://www.cnblogs.com/senior-engineer/p/7867783.html)

- 18.什么情况下你会使用到ScrollView。

> [点击查看答案](https://www.cnblogs.com/plokmju/p/android_ScrollView.html)

- 19.低版本SDK如何使用高版本API？

> [点击查看答案](http://www.cnblogs.com/android-blogs/p/5841638.html)

- 20.AlertDialog,PopWindow,Activity之间的区别？

> [点击查看答案](https://www.cnblogs.com/xgjblog/p/3994865.html)

- 21.Application和Activity,Context的区别？

> [点击查看答案](https://www.cnblogs.com/liyiran/p/5283551.html)

- 22.谈谈Android中多线程通信方式？

> [点击查看答案](https://www.cnblogs.com/WoodJim/p/4737171.html)

- 23.说说Android大体的架构图，试着画出来。

> [点击查看答案](https://www.cnblogs.com/xiaoluo501395377/p/3389411.html)

- 24.知道SpareArray吗？

> [点击查看答案](https://www.cnblogs.com/RGogoing/p/5095168.html)

- 25.Activity除了setContentView可以设置布局，还有其它方式吗？

> 还有一种异步的方式:AsyncLayoutInflater。
> [AsyncLayoutInflater](https://www.jianshu.com/p/f0c0eda06ae4)

- 26.Android为每个应用程序分配的内存大小为多少？

> [点击查看答案](https://www.cnblogs.com/liujinyao/p/4705625.html)

- 27.Android进程保活方案？

> [点击查看答案](https://www.cnblogs.com/luhan/p/6018686.html)

- 28.谈谈Android系统安装apk的过程？

> [点击查看答案](https://www.cnblogs.com/zhangmiao14/p/6950561.html)

- 29.Activity,Window,View三者的关系？

> [点击查看答案](http://www.cnblogs.com/kest/p/5141817.html)

- 30.ActivityThread,ActivityManagerService,WindowManagerService的工作原理？

> [ActivityThread](https://www.cnblogs.com/younghao/p/5126408.html)
> [ActivityManagerService](https://www.cnblogs.com/xingchenkn/p/3637137.html)
> [WindowManagerService](https://www.jianshu.com/p/f9b3787fc0cd)

- 31.PackageManagerService的工作原理？

> [点击查看答案](https://www.cnblogs.com/chenlong-50954265/p/5729553.html)

- 32.PowerManagerService的工作原理？

> [点击查看答案](https://www.cnblogs.com/onelikeone/p/9521761.html)

- 33.在桌面点击一个未启动的App的流程 & 点击一个已启动的App的流程？

> 这个实际上在考察冷启动和热启动。前面已经提供答案。

- 34.Android中进程分为哪些种类？

>1、前台进程：即当前正在前台运行的进程，说明用户当前正在与通过该进程与系统进行交互，所以该进程为最重要的进程，除非系统的内容已经到不堪重负的情况，否则系统是不会将改进程终止的。

>2、可见进程：一般还是显示在屏幕中，但是用户并没有直接与之进行交互，该进程对用户来说同样是非常重要的进程，除非为了保证前台进程的正常运行，否则Android系统一般是不会将该进程终止的。

>3、服务进程：便是拥有Service进程，该进程一般是在后台为用户服务的。一般情况下，Android系统是不会将其中断的，除非系统的内容以及达到崩溃的边缘，必须通过释放该进程才能保证前台进程的正常运行时，才可能将其终止。

>4、后台进程：一般对用户的作用不大，缺少该进程并不会影响用户对系统的体验。所以如果系统需要终止某个进程才能保证系统正常运行，那么会有非常大的几率将该进程终止。

>5、空进程：对用户没有任何作用的进程，该进程一般是为缓存机制服务的，当系统需要终止某个进程保证系统的正常服务时，会首先将该进程终止。

- 35.什么是埋点，懂点它的原理吗？

> [点击查看答案](http://ju.outofmemory.cn/entry/338292)

- 36.进程和Application生命周期之间的关系？

> [点击查看答案](https://blog.csdn.net/qq_37679744/article/details/71212713)

- 37.App相互唤醒的有哪些方式？

> [点击查看答案](https://juejin.im/post/5c91fde2f265da60ea145b80)

- 38.Android中如何开启多进程？应用是否可以开启N个进程？

> [点击查看答案](http://www.cnblogs.com/weizhxa/p/8457987.html)

- 39.谈谈消息推送的方式有哪些？

> [点击查看答案](http://www.cnblogs.com/hanyonglu/archive/2012/03/04/2378971.html)
