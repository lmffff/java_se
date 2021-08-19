package IO;

import java.io.*;
//buffer 和 字符流
public class Buffered {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("javaIO\\outputFile.txt"));
//        bos.write("hello world".getBytes());
//        bos.close();
//
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("javaIO\\outputFile.txt"));
//        int temp;
//        while((temp = bis.read())!= -1){
//            System.out.print((char)temp);
//        }
//        bis.close();


        //字符流 刷新才可以从缓冲区写入 close时自动flush
        OutputStreamWriter ops = new OutputStreamWriter(new FileOutputStream("javaIO\\outputFile.txt"));
        ops.write("hhh");
        ops.flush();
        ops.write("555");
        ops.close();

        //读取 单字节、字符数组
        InputStreamReader isr = new InputStreamReader(new FileInputStream("javaIO\\outputFile.txt"));
//        int ch;
//        while((ch = isr.read())!= -1){
//            System.out.print((char)ch);
//        }

        char[] chs = new char[1024];
        int len;
        while((len = isr.read(chs)) != -1){
            System.out.println(new String(chs,0,len));
        }
        isr.close();
    }
}
