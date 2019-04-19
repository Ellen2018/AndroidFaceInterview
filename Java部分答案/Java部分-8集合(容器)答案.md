### 1.8 集合(容器)

- 1.说说Java中集合的框架？

> [点击查看答案](https://www.cnblogs.com/cao-yin/p/9608250.html)

- 2.Collection & Map区别

>Collection和Map接口之间的主要区别在于：Collection中存储了一组对象，而Map存储关键字/值对。>Collection接口，包含list和set子接口；继承Map的类有HashMap，HashTable。下面来给大家详细做一分
>析：

>Collection：

>1、Collection是最基本的集合接口，一个Collection代表一组Object，即Collection的元素（Elements）。

>一些Collection允许相同的元素而另一些不行。一些能排序而另一些不行。Java SDK不提供直接继承自Collection的类，Java SDK提供的类都是继承自Collection的“子接口”如List和Set。

>2、所有实现Collection接口的类都必须提供两个标准的构造函数：无参数的构造函数和有一个Collection参数的构造函数。其中无参数的构造函数用于创建一个空的Collection；有一个Collection参数的构造函数用于创建一个新的Collection。

>Map：1、Map对象中，每一个关键字最多有一个关联的值。

>2、不能包括两个相同的键，一个键最多能绑定一个值。null可以作为键，这样的键只有一个；可以有一个或多个键所对应的值为null。

>3、当get()方法返回null值时，即可以表示Map中没有该键，也可以表示该键所对应的值为null。因此，在Map中不能由get()方法来判断Map中是否存在某个键，而应该用containsKey()方法来判断。

>4、Map接口提供3种集合的视图，Map的内容可以被当作一组key集合，一组value集合，或者一组key-value映射。

- 3.谈谈你常用的集合 & 它们底层的实现方式 & 优缺点 & 使用场景。

> 这道题目就不提供答案。将List,Set,Map,Queue等子类集合都说说，结合底部实现的数据结构特性，这样就能大致通过这道题目。

- 4.Map的遍历方式有哪些？

> [点击查看答案](https://www.cnblogs.com/fqfanqi/p/6187085.html)

- 5.给我说说ArrayList的扩容机制。

> [点击查看答案](https://blog.csdn.net/zymx14/article/details/78324464)

- 6.什么是深拷贝 & 浅拷贝 & 如何深拷贝一个List集合. 

> [什么是深拷贝 & 什么是浅拷贝](https://www.cnblogs.com/qlky/p/7348353.html)  
> 如何深拷贝一个List集合？  
> 方法1：利用Json拷贝法->利用Gson库将一个List集合映射为一个Json字符串，然后再通过Gson库解析Json成一个List集合即可。  
> 方法2：序列化法 ->与方法1思路类似  
> 方法3：如果要深拷贝的类不复杂，那么可以重写clone方法并遍历。  

- 7.Set是如何确保它的唯一性的。

> **对于HashSet而言**,它是通过两个方法来判断其元素是否一样，这两个方法就是hashCode()方法和equlas()方法，首先，hashCode()方法返回的是一个哈希值，这个哈希值是由对象在内存中的地址所形成的，如果两个对象的哈希值不一样，那么这两个对象肯定是不相同的，如果哈希值一样，那么这还不能肯定这两个对象是否一样，还需要通过equlas()方法比较一下两个对象是否一样，equals()返回true才能说明这两个对象是相同的，所以当你想把你自定义的类对象放入此集合，最好重写一下hashCode()方法和equals()方法来保证Set集合”无序不可重复”的特点。  
> **对于TreeSet而言**，Comparable接口(比较器)的compareTo()方法进行判断元素是否一样。compareTo()返回0则代表两个元素是一样的。正值代表大于，负值代表小于。

- 8.你觉得HashMap的元素顺序和什么有关？

> [点击查看答案](https://blog.csdn.net/vking_wang/article/details/14166593)

- 9.Java中HashMap如何解决哈希碰撞的？

> [点击查看答案](https://blog.csdn.net/luo_da/article/details/77507315)

- 10.ConcurrentHashMap如何实现并发访问的？

> [点击查看答案](https://www.cnblogs.com/kaffeetrinken/p/8545417.html)

- 11.谈谈Java集合中那些线程安全的集合 & 实现原理。

> 这个问题的答案笔者就不提供了，简单的说说几种即可。比如Vector & HashTable等

- 12.说说有哪些集合能加入null,哪些不能加入null,为什么？

> [点击查看答案](https://blog.csdn.net/ml1990s/article/details/11649237)

- 13.说说LinkedHashMap原理。

> [点击查看答案](https://www.cnblogs.com/whgk/p/6169622.html)
> 这道问题一般会在问你图片加载LruCache实现原理的时候提到。

- 14.Collection 和 Collections的区别？

> [点击查看答案](https://www.cnblogs.com/cathyqq/p/5279859.html)

- 15.比较一下ArrayMap和HashMap。

> [点击查看答案](https://www.cnblogs.com/clwydjgs/p/9185574.html)

- 16.说说HashMap的原理。

> [点击查看答案](https://www.cnblogs.com/chengxiao/p/6059914.html)