package List;

import java.util.TreeSet;

//构造方法可以定义决定元素排序方式
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); //无参构造
        ts.add(20);
        ts.add(10);
        ts.add(30);
        System.out.println(ts);
        for(int i : ts){
            System.out.println(i);
        }
    }
}
