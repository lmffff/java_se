package Others;

import java.util.ArrayList;
import java.util.List;

//泛型demo 泛型方法、泛型通配符、泛型-参数个数可变
public class GenericDemo {
    public static void main(String[] args) {
//        Generic g = new Generic();
//        g.show("I want a cup of tea");
//        g.show(18);

        //通过观察编译是否报错来判断泛型的使用是否正确,以及extends & super 的用法，类似多态
//        List<?> l1 = new ArrayList<Object>();
//        List<?> l2 = new ArrayList<Number>();
//        List<?> l3 = new ArrayList<Integer>();

//        List<? extends Number> l4 = new ArrayList<Object>();   //exception
//        List<? extends Number> l5 = new ArrayList<Number>();
//        List<? extends Number> l6 = new ArrayList<Integer>();
//
//        List<? super Number> l7 = new ArrayList<Object>();
//        List<? super Number> l8 = new ArrayList<Number>();
//        List<? super Number> l9 = new ArrayList<Integer>();   //exception


        //参数可变
        System.out.println(sumNum(1,2,3));
    }

    public static int sumNum(int... a){        //参数可变
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

}
