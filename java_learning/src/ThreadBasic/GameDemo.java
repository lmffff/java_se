package ThreadBasic;

public class GameDemo {
    public static void main(String[] args) {
        GameSellTickets g1 = new GameSellTickets();
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g1);
        Thread t3 = new Thread(g1);

        t1.start();
        t2.start();
        t3.start();
    }
}
