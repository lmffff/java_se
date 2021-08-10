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

          //StringBuilder append reverse
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" +  sb);
        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println("sb1:" + sb1);
        System.out.println("sb1:" + sb1.reverse());
        sb1.append(" stringBuilder append");
        System.out.println("sb1:"+sb1);


        // StringBuilder<-->String
        String s5 = sb1.toString();
        System.out.println("s5:"+s5);

        String s6 = "HELLO";
        StringBuilder sb2 = new StringBuilder(s6);
        System.out.println("s6:"+s6 + " sb2:"+sb2);







    }
}
