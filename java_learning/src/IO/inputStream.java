package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//使用标准输入流从键盘读取 1.字符串  2.整数
public class inputStream {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;
        System.out.println("请输入一个字符串");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        System.out.println("你输入的字符串是："+s1);

        System.out.println("请输入一个整数");
        int in = Integer.parseInt(bf.readLine());
        System.out.println("你输入的整数是："+in);


    }
}
