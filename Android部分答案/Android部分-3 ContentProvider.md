### 2.3 ContentProvider

- 1.什么是内容提供者？
- 2.说说如何创建自己应用的内容提供者 & 使用场景。
- 3.说说ContentProvider的原理。

> [1~3题答案](https://blog.csdn.net/ClAndEllen/article/details/82765220)

- 4.ContentProvider,ContentResolver,ContentObserver之间的关系？

>ContentProvider——内容提供者， 在android中的作用是对外共享数据，也就是说你可以通过
>
>ContentProvider把应用中的数据共享给其他应用访问，其他应用可以通过ContentProvider 对你应用中的数据进行添删改查。
>
>ContentResolver——内容解析者， 其作用是按照一定规则访问内容提供者的数据（其实就是调用内容提供者自定义的接口来操作它的数据）。
ContentObserver——内容观察者，目的是观察(捕捉)特定Uri引起的数据库的变化，继而做一些相应的处理，它类似于数据库技术中的触发器(Trigger)，当ContentObserver所观察的Uri发生变化时，便会触发它。


- 5.说说ContentProvider的权限管理。

访问权限：对于ContentProvider暴露出来的数据，应该是存储在自己应用内存中的数据，对于一些存储在外部存储器上的数据，并不能限制访问权限，使用ContentProvider就没有意义了。对于ContentProvider而言，有很多权限控制，可以在AndroidManifest.xml文件中对<provider>节点的属性进行配置，一般使用如下一些属性设置：

>android:grantUriPermssions:临时许可标志。
>
>android:permission:Provider读写权限。
>
>android:readPermission:Provider的读权限。
>
>android:writePermission:Provider的写权限。
>
>android:enabled:标记允许系统启动Provider。
>
>android:exported:标记允许其他应用程序使用这个Provider。
>
>android:multiProcess:标记允许系统启动Provider相同的进程中调用客户端。

