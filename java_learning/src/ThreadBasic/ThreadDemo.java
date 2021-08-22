package ThreadBasic;
// 返回当前线程 调用static方法currentThread()
// 多线程的使用 start()
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("curThread:"+Thread.currentThread());
////        MyThread thread1 = new MyThread("2看电视");
////        MyThread thread2 = new MyThread("1吃零食");
////        MyThread thread3 = new MyThread("0写作业");
//        Thread.currentThread().setName("刘备");
//        MyThread thread2 = new MyThread("关羽");
//        MyThread thread3 = new MyThread("张飞");
//
//        //优先级
////        thread1.setPriority(10);
////        thread2.setPriority(1);
//
//        //辅助线程
//        thread2.setDaemon(true);
//        thread3.setDaemon(true);
//
//        thread3.start();
////        thread3.join();   //首要线程：执行完写作业之后才是吃零食和看电视
//        thread2.start();
//        for(int i = 0;i<10;i++){
//            System.out.println(Thread.currentThread().getName()+":"+i);
//        }
//


        //第二种多线程创建方式
        threadInterface ti = new threadInterface();
        Thread interThread = new Thread(ti);
        Thread interThread1 = new Thread(ti);

        interThread.start();
        interThread1.start();



    }
}
