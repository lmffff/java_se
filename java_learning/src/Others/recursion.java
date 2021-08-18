package Others;

public class recursion {
    public static void main(String[] args) {
        System.out.println(recur(3));
    }
    public static int recur(int num){
        if(num == 1){
            return 1;
        }
        return num*(recur(num-1));
    }
}
