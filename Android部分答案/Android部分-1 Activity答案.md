### 2.1 Activity

- 1.Activity是什么？
- 2.典型情况下的Activity生命周期？
- 3.异常情况下的Activity的生命周期 & 数据如何保存和恢复？ 

> [1~3题答案](https://blog.csdn.net/clandellen/article/details/79257489)

- 4.从Activity A跳转到Activity B之后，然后再点击back建之后，它们的生命周期调用流程是什么？

> 从Activity A跳转到Activity B  
> Activity A --> onPause()  
> Activity B --> onCreate()  
> Activity B --> onStart()  
> Activity B --> onResume()  
> Activity A --> onStop()    
> 然后在Activity B点击back键  
> Activity B --> onPause()  
> Activity A --> onRestart()  
> Activity A --> onStart()  
> Activity A --> onResume()  
> Activity B --> onStop()  
> Activity B --> onDestory()  

- 5.如何统计Activity的工作时间？

> 这道题目也在考察Activity的生命周期，Activity开始工作的起点是onResume()而工作的停止点为onPause(),因此当每次Activity调用onResume()的时候记录一个时间a，每次调用onPause()的时候再记录一个时间b,那么由b-a可得当次Activity工作的时间。

- 6.给我说说Activity的启动模式 & 使用场景。

> 这道题目答案在上面1~3题答案的链接里。

- 7.如何在任意位置关掉应用所有Activity & 如何在任意位置关掉指定的Activity？

> 这道题目的答案也很简单，封装一个类,成员变量有一个List<Activity>集合，当Activity执行onCreate()方法时将当前的Activity实例加入，当Activity执行onDestory()方法时，移除当前Activity实例即可，如何关闭应用所有的Activity,答案就是遍历这个List<Activity>且逐一调用finish()方法即可，至于如何在任意位置关闭当前的Activity,这里需要考虑给每个启动的Activity一个tag,根据这个tag和集合可达到在任意位置关闭指定Activity的效果。

- 8.Activity的启动流程(从源码角度解析)？

> [点击查看答案](https://www.cnblogs.com/kross/p/4025075.html)

- 9.启动一个其它应用的Activity的生命周期分析。

> 这里不仅仅考察Activtiy的生命周期问题，还考察返回栈的问题。具体答案请查看1~3题答案链接。

- 10.Activity任务栈是什么？在项目中有用到它吗？说给我听听

> [点击查看答案](https://www.cnblogs.com/z964166725/p/8729208.html)

- 11.什么情况下Activity不走onDestory?
- 12.什么情况下Activity会单独执行onPause?

> 11和12题答案也在1-3的答案链接里。

- 13.a->b->c界面，其中b是SingleInstance的，那么c界面点back返回a界面，为什么？

> 这题实际在考察你对Activity启动模式SingleInstance的知识点，首先我们来看看SingleInstance的特性：


>单实例模式：SingleInstance
  这是一种加强的singleTask模式，它除了具有singleTask模式所有的特性外，还加强了一点，那就是具有此种模式的Activity只能单独位于一个任务栈中，换句话说，比如Activity A是singleInstance模式，当A启动后，系统会为它创建一个新的任务栈，然后A独自在这个新的任务栈中，由于栈内复用的特性，后续的请求均不会创建新的Activity,除非这个独特的任务栈被系统销毁了。

>对于SingleInstance,面试时你有说明它的以下几个特点：

>（1）以singleInstance模式启动的Activity具有全局唯一性，即整个系统中只会存在一个这样的实例。
（2）以singleInstance模式启动的Activity在整个系统中是单例的，如果在启动这样的Activiyt时，已经存在了一个实例，那么会把它所在的任务调度到前台，重用这个实例。
（3）以singleInstance模式启动的Activity具有独占性，即它会独自占用一个任务，被他开启的任何activity都会运行在其他任务中。
（4）被singleInstance模式的Activity开启的其他activity，能够在新的任务中启动，但不一定开启新的任务，也可能在已有的一个任务中开启。

> 换句话说，其实SingleInstance就是我们刚才分析的SingleTask中，分享Activity为栈底元素的情况。


- 14.如果一个Activity弹出一个Dialog,那么这个Acitvity会回调哪些生命周期函数呢？

> 也许你会不假思索的回答会回调onPause()方法,然而...
> [点击查看答案](https://blog.csdn.net/yz_cfm/article/details/85476263)

- 15.Activity之间如何通信 & Activity和Fragment之间通信 & Activity和Service之间通信？

> 答案在1~3题答案链接中

- 16.说说Activity横竖屏切换的生命周期。

> 答案在1~3题答案链接中

- 17.前台切换到后台，然后在回到前台时Activity的生命周期。

> 答案在1~3题答案链接中

- 18.下拉状态栏时Activity的生命周期？

> [点击查看答案](https://www.jianshu.com/p/781bc86f8042)

- 19.Activity与Fragment的生命周期比较？

> [点击查看答案](https://www.jianshu.com/p/6fb2936d2d3c)

- 20.了解哪些Activity常用的标记位Flags？

常用标记位

>1.Intent.FLAG_ACTIVITY_NEW_TASK，是为Activity指定“singleTask”启动模式
>
>2.Intent.FLAG_ACTIVITY_SINGLE_TOP，是为Activity指定“singleTop”启动模式
>
>3.FLAG_ACTIVITY_CLEAR_TOP，如果跟singleTask启动模式一起出现，如果被启动的Activity已经存在实例，则onNewIntent方法会被回调，如果被启动的Activity采用standard模式启动，那么连同它跟它之上的Activity都要出栈，并且创建新的实例放入栈顶。
>
>4.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS，新的Activity不会在最近启动的Activity的列表中保存。等同于指定属性android:excludeFromRecents="true"

- 21.谈谈隐式启动和显示启动Activity的方式？

> [点击查看答案](https://www.jianshu.com/p/27d0ec1c52b2)

- 22.Activity用Intent传递数据和Bundle传递数据的区别？为什么不用HashMap呢？

> [点击查看答案](https://www.cnblogs.com/On1Key/p/5180022.html)
