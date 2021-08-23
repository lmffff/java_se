package ThreadBasic;

public class Box{
    private int milk;
    private boolean state;
    public synchronized void put() throws InterruptedException {
        for(int i = 0;i<5;i++){
            if(state){
                wait();
            }
//            else {
            System.out.println("放入第"+i+"瓶奶");
            state = true;
            notifyAll();
//            }
        }

    }

    public synchronized void get() throws InterruptedException {
        for(int i = 0;i<5;i++){
            if(!state){
                wait();
            }
//            else {
            System.out.println("拿到第"+i+"瓶奶");
            state = false;
            notifyAll();
//            }
        }
    }
}
