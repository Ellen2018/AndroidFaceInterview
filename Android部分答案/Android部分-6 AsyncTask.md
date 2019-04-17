### 2.6 AsyncTask

- 1.AsyncTask是什么？能解决什么问题
- 2.给我谈谈AsyncTask的三个泛型参数作用 & 它的一些方法作用。
- 3.给我说说AsyncTask的原理。

> [1~3答案](https://blog.csdn.net/ClAndEllen/article/details/79346383)

- 4.你觉得AsyncTask有不足之处吗？

&emsp;&emsp;**a.内存泄漏**:

&emsp;&emsp;静态内部类持有外部类的匿名引用，导致外部对象无法得到释放，解决方法很简单，让内部持有外部的弱引用即可解决

&emsp;&emsp;**b.生命周期**
&emsp;&emsp;在Activity的onDestory()中及时对AsyncTask进行回收，调用其cancel()方法来保证程序的稳定性。

&emsp;&emsp;**c.结果丢失**
&emsp;&emsp;当内存不足时，当前的Activity被回收，由于AsyncTask持有的是回收之前Activity的引用，导致AsyncTask更新的结果对象为一个无效的Activity的引用，这就是结果丢失。

&emsp;&emsp;**d.并行或串行**
&emsp;&emsp;在1.6(Donut)之前: 在第一版的AsyncTask，任务是串行调度。一个任务执行完成另一个才能执行。由于串行执行任务，使用多个AsyncTask可能会带来有些问题。所以这并不是一个很好的处理异步（尤其是需要将结果作用于UI试图）操作的方法。1.6-2.3： 所有的任务并发执行，这会导致一种情况，就是其中一条任务执行出问题了，会引起其他任务出现错误。3.0之后AsyncTask又修改为了顺序执行，并且新添加了一个函数 executeOnExecutor(Executor)，如果您需要并行执行，则只需要调用该函数，并把参数设置为并行执行即可。