package ThreadBasic;

public class Consumer implements Runnable{
    private Box b;

    public Consumer(Box b1) {
        b = b1;
    }

    @Override
    public void run() {
        try {
            b.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
