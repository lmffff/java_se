package ThreadBasic;

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();

        Producer p1 = new Producer(b1);
        Consumer c1 = new Consumer(b1);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);

        t1.start();
        t2.start();
    }
}
