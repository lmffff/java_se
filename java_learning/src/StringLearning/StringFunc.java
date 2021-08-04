package StringLearning;

//equals方法的使用
public class StringFunc {
    public static void main(String[] args) {
        char[] chs = {'a','b','c'};  //字符数组
        String s1 = new String(chs);
        String s2 = new String(chs);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("地址值不同，但数据相同");

        String s3 = "1234";      //常量
        String s4 = "1234";      //常量
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println("地址值和数据都相同");



    }
}

