package ThreadBasic;

public class GameSellTickets implements Runnable{
    private Object obj =new Object();
    private int tickets = 100;
    @Override
    public void run() {
        //第一种锁方法
        sellTicket();
        //第二种锁方法
        synchronized (obj){
            while(true){
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+":"+tickets);
                    tickets--;
                }else{
//            Thread.currentThread().stop();
                }
            }
        }



    }




    public synchronized void sellTicket(){
        while(true){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+":"+tickets);
                tickets--;
            }else{
//            Thread.currentThread().stop();
            }
        }
    }
}
