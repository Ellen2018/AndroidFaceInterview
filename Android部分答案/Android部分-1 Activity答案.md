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

> 这题实际在考察你对Activity启动模式SingleInstance的知识点，
