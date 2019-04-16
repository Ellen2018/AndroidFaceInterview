### 1.3 面向过程 & 面向对象

- 1.什么是面向过程 & 什么是面向对象 & 区别？

> [点击查看答案](https://blog.csdn.net/qq_33811662/article/details/80639390)

- 2.给我说说Java面向对象的特征以及讲讲你代码中凸显这些特征的经验。

> [点击查看Java面向对象的特征](https://www.cnblogs.com/guweiwei/p/6599289.html)  
> 至于讲讲代码中凸显这些特征的经验,其实说说还是很简单的，你可以将你的Base层如何封装的，说一下就是ok了。

- 3.什么是重载 & 什么是重写 & 区别.

>[点击查看答案](https://www.cnblogs.com/guweiwei/p/6288068.html)

- 4.谈谈你对this和super的认识.

> 其实这个题目是个送分题:  
> this:就是类中指向对象本身的一个特殊引用。    
> super:向自己超（父）类对象的一个指针，而这个超类指的是离自己最近的一个父类。  
> [学习请点击此链接](https://www.cnblogs.com/hasse/p/5023392.html)

- 5.接口和抽象类的区别。

> [点击查看答案](https://www.cnblogs.com/3020815dzq/p/8509137.html)

- 6.静态属性和静态方法能被继承吗？静态方法又是否能被重写呢？

> [点击查看答案](https://www.cnblogs.com/twoheads/p/10244017.html)

- 7.给我说说权限修饰符特性。

> [点击查看答案](https://www.cnblogs.com/chuijingjing/p/9461165.html)

- 8.给我谈谈Java中的内部类。

> [点击查看答案](https://www.cnblogs.com/dolphin0520/p/3811445.html)

- 9.闭包和内部类的区别？

> [点击查看答案](https://www.cnblogs.com/tiancai/p/7350464.html)

- 10.Java多态的实现机制是什么？

> [点击查看答案](https://www.cnblogs.com/crane-practice/p/3671074.html)

- 11.谈谈你对对象生命周期的认识？

> [点击查看答案](https://www.cnblogs.com/mengfanrong/p/4007456.html)

- 12.static关键字的作用？

> [点击查看答案](https://www.cnblogs.com/starhu/p/5150241.html)

- 13.final关键字的作用。

> [点击查看答案](https://www.cnblogs.com/xiaoxi/p/6392154.html)

### 1.4 八大基本数据类型&引用类型

- 1.说说Java中的8大基本类型 & 内存中占有的字节 & 什么是引用类型？

> [点击查看答案](https://blog.csdn.net/ClAndEllen/article/details/81543128)

- 2.什么是拆箱 & 装箱，能给我举栗子吗？

        public class CzDemo {

            public static void testInt(int a){
                System.out.println(a);
            }

            public static void testInteger(Integer a){
                System.out.println(a);
            }

            public static void main(String[] args){
                Integer integer = new Integer(3);
                //这里进行了拆箱，将Integer拆箱为int
                testInt(integer);
                int a = 3;
                //这里进行了装箱，将int装箱为Integer
                testInteger(a);
            }
        }


### 1.5 数组

- 1.能说说多维数组在内存上是怎么存储的吗？

>[点击查看答案](https://blog.csdn.net/ClAndEllen/article/details/81710931)

- 2.你对数组二次封装过吗？说说封装了什么

> 这题笔者就不提供答案了。