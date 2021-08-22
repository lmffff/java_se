package ThreadBasic;

public class GameSellTickets implements Runnable{

    private int tickets = 100;
    @Override
    public void run() {
        sellTicket();

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
