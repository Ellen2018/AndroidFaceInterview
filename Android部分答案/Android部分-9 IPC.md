### 2.9 IPC

- 1.说说你对Android多进程开发的认识？

> [点击查看答案](https://www.jianshu.com/p/ce1e35c84134)

- 2.Android中进程间通信的方式有哪些？

> [点击查看答案](https://www.cnblogs.com/lizhengxian/p/5075635.html)

- 3.什么是AIDL?如何创建一个AIDL。

> 什么是AIDL: AIDL允许定义一个编程的接口来作为客户端和服务端通信的桥梁，AIDL定义了客户端和服务端的编程标准，在Android里边一个进程无法直接访问另一个进程的内存信息，但是要访问的话，我们就需要把他们的设备分解成操作系统能认识的基本数据类型。使用AIDL必须要跨进程，所以通讯起来非常耗内存和系统资源，因此，没有必要处处用AIDL，那么什么时候用AIDL呢，通过IPC机制不同的程序访问你的服务，并且服务要处理多线程的时候才有必要使用AIDL，如果你只是想通过IPC机制要不同的程序访问你的服务的时候，实现Binder就可以了；如果只想通过IPC机制，但是不想控制多线程，实现Messanger就可以了，Binder和Messanger都是在单线程中完成的。
> [如何创建一个AIDL](https://www.cnblogs.com/rookiechen/p/5352053.html)