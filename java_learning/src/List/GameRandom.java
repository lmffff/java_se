package List;

import java.util.*;

//生成一个包含10个不同随机数的set,TreeSet可以按顺序排列
public class GameRandom {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();

        while (set.size()!=10){
            Random ra = new Random();
            int temp = ra.nextInt(20);
            set.add(temp);
        }
        System.out.println(set);
    }
}
