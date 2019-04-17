### 2.10 文件存储

- 1.说说Android中数据持久化的方式 & 使用场景。

> [点击查看答案](https://www.cnblogs.com/plokmju/p/Android_Storage.html)

- 2.接触过MMKV吗？说说SharedPreference和它的区别。

> [点击查看答案](https://www.jianshu.com/p/92bcb77f8eca)

- 3.第三方数据库框架用过哪些？有没有自己封装过一个SQLite的库？

> 第三方数据库框架，说说你用过的就行了，至于有没有封装过一个SQLite库,笔者只能说说封装SQLite库本身不是一件简单的事,可以说自己没有封装过，但是要熟悉一些第三方数据库框架的原理，说说原理也是可以的。

- 4.SQLite是线程安全的吗 & SharedPreference是线程安全的吗？

> [SQLite是线程安全的吗](https://blog.csdn.net/u011342466/article/details/79740086)  
> [SharedPreference是线程安全的吗](https://www.cnblogs.com/mingfeng002/p/5970221.html)

- 5.请简单的给我说说什么是三级缓存？

> [点击查看答案](https://www.cnblogs.com/huangjie123/p/6130665.html)

- 6.SharedPreference的apply和commit的区别。

>这两个方法的区别在于：
>1. apply没有返回值而commit返回boolean表明修改是否提交成功
>
>2.apply是将修改数据原子提交到内存, 而后异步真正提交到硬件磁盘, 而commit是同步的提交到硬件磁盘，因此，在多个并发的提交commit的时候，他们会等待正在处理的commit保存到磁盘后在操作，从而降低了效率。而apply只是原子的提交到内容，后面有调用apply的函数的将会直接覆盖前面的内存数据，这样从一定程度上提高了很多效率。
>
>3.apply方法不会提示任何失败的提示。
由于在一个进程中，sharedPreference是单实例，一般不会出现并发冲突，如果对提交的结果不关心的话，建议使用apply，当然需要确保提交成功且有后续操作的话，还是需要用commit的。

- 7.谈谈你对SQLite事务的认识。

> [点击查看答案](http://www.runoob.com/sqlite/sqlite-transaction.html)

- 8.千奇百怪的SQL语句考察。

> 通常如果面试的公司项目中有数据库开发,都会问些简单的SQL语句,比如：如何创建表，查询某个表里含有某个字符串的数据，删除表的某个字段等。
> [点击学习SQLite语句](http://www.runoob.com/sqlite/sqlite-syntax.html)

- 9.SharePreference跨进程使用会怎么样？如何保证跨进程使用安全？

> [点击查看答案](http://www.cnblogs.com/mzhou/p/3941008.html)
> [深度剖析SharePreference](http://www.cnblogs.com/wenjianes/p/10114394.html)