package IO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
//编码 解码
public class StringByte {
    public static void main(String[] args) throws UnsupportedEncodingException{
        String s1 = "编码";
        byte[] by1 = s1.getBytes();
        System.out.println(Arrays.toString(by1));

        String s2 = new String(by1,"GBK");
        System.out.println(s2);
    }
}
