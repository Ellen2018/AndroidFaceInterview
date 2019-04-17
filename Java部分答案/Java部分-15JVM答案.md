### 1.15 JVM相关

- 1.什么是class文件？它存在的意义？

>Java的编译器在编译java类文件时，会将原有的文本文件（.java）翻译成二进制的字节码，并将这些字节码存储在.class文件。

>也就是说java类文件中的属性、方法，以及类中的常量信息，都会被分别存储在.class文件中。当然还会添加一个公有的静态常量属性.class，这个属性记录了类的相关信息，即类型信息，是Class类的一个实例。  
>**class文件存在的意义**就是:跨平台。

- 2.Java代码执行流程？

> [点击查看答案](https://blog.csdn.net/sinat_33087001/article/details/76977437)

- 3.Java内存结构 & 内存模型。

> [点击查看答案](https://www.cnblogs.com/qingshanli/p/9256387.html)

- 4.GC回收机制。

> [点击查看答案](https://www.cnblogs.com/wjtaigwh/p/6635484.html)

- 5.Java虚拟机是如何加载一个类的？

> [点击查看答案](https://www.cnblogs.com/luohanguo/p/9469851.html)

- 6.给我谈谈类加载器。

> [点击查看答案](https://www.cnblogs.com/sunniest/p/4574080.html)

- 7.谈谈static编译运行时的流程，在虚拟机中如何保存的？

> [点击查看答案](https://www.cnblogs.com/cxiang/p/10082160.html)

- 8.说说Java种的4种引用以及用法？

> [点击查看答案](https://www.cnblogs.com/alias-blog/p/5793108.html)

- 9.如何判断一个对象是死亡的？

> [点击查看答案](https://www.cnblogs.com/LoganChen/p/6829165.html)

- 10.代码中直接调用System.gc()会发生什么？

> [点击查看答案](https://www.jianshu.com/p/c5e631b8ea59)

- 11.一个强引用直接被null赋值，那么这个对象会被立刻回收吗？

> 这个要看情况，一般GC回收一个对象是由于这个对象没有任何引用指向它了，GC才会选择去回收它，如果有至少两个强引用指向它，那么一个引用设置为null,这种情况这个对象是不会被回收的。然后如果只有一个引用指向它时,也有可能不会被立刻回收，这个对象只是进入一种可回收的状态，回收是肯定的，但是不会立刻，有可能发生在下一个GC回收周期里。

- 12.String a = "a"+"b"+"c";在内存中创建了几个对象？

> [点击查看答案](https://blog.csdn.net/zheng0518/article/details/9025173)
> 这题是个小陷阱，在回答的时候，一定要注意编译器在编译期间会对代码进行优化，一定要考虑这一点。

- 13.谈谈你对字符集的理解。

> [点击查看答案](https://www.cnblogs.com/hanruyue/p/5859107.html)

- 14.常见的编码格式有哪些？

> [点击查看答案](https://www.cnblogs.com/yaya-yaya/p/5768616.html)

- 15.utf-8中的中文占几个字节？int型占几个字节？

> 在utf-8中中文是占用3个字节，int类型占用4个字节。

- 16.谈谈你对逻辑地址和物理地址的理解？

> [点击查看答案](https://www.cnblogs.com/alantu2018/p/9002441.html)
