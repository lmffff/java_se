package ThreadBasic;

public class Producer implements Runnable{
    public Box b;

    public Producer(Box b1) {
        b = b1;
    }

    @Override
    public void run() {
        try {
            b.put();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
