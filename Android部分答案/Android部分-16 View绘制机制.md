### 2.16 View绘制机制

- 1.说说View绘制流程。
- 2.说说Activity View树结构。

> [点击查看答案](https://blog.csdn.net/ClAndEllen/article/details/79365250)

- 3.自定义View的方式有哪些?给我说说你之前项目中的案例。

> [点击查看答案](https://www.cnblogs.com/wangjianglin-2015/p/4243954.html)

- 4.invalidate和postvalidate的区别？

> [点击查看答案](https://www.cnblogs.com/rayray/p/3437048.html)

- 5.说说你在自定义View时常常重写的一些方法？

> [点击查看答案](https://blog.csdn.net/forever_love007/article/details/80735777)

- 6.说说自定义View中如何自定义属性？

> [点击查看答案](https://blog.csdn.net/ClAndEllen/article/details/79412399)

- 7.requestLayout(),onLayout(),onDraw(),drawChild()区别和联系？

> 这题答案笔者就不提供了。在很多View绘制的文章中都有这4个方法的分析。

- 8.如何计算出一个View的嵌套层级？

    while (view.getParents() != null) {
        count++;
        view = view.getParents();
    }

- 9.自定义View如何考虑机型适配？

> [点击查看答案](https://www.jianshu.com/p/1eaab1e43681)