package StringLearning;

//创建字符串对象，并输出
public class StringDemo {
    public static void main(String[] args) {
//        String s1 = new String();   //空字符串
//        System.out.println("s1:"+s1);
//
//        char[] chs = {'a','b','c'};  //字符数组
//        String s2 = new String(chs);
//        System.out.println("s2:"+s2);
//
//        char[] bys = {120,121,122};  //字节数组 ASCII码
//        String s3 = new String(bys);
//        System.out.println("s3:"+s3);
//
//        String s4 = "1234";      //常量
//        System.out.println(s4);



//        //遍历字符串
//        String str1 = "abcde";
//        for(int i = 0;i < str1.length(); i++){
//            System.out.println(str1.charAt(i));
//        }

          //StringBuilder
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" +  sb);
        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println("sb1:" + sb1);
    }
}
