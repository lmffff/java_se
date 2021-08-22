package ThreadBasic;

public class MyThread extends Thread{

    public MyThread(){}
    public MyThread(String s){
        super(s);
    }
    @Override
    public void run() {
        super.run();
        for(int i = 0;i<100;i++){
//            if(i%1000==0){
                System.out.println(getName()+":"+ i);
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            }
        }
    }
}