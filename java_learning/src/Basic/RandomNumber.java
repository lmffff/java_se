package Basic;
// use random class to output a number (0,10) 
import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random ra = new Random();
        System.out.println(ra.nextInt(10));  //10:36
    }
}
