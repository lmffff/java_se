package IO;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBasic {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("D:\\develop\\java\\file\\javaIO.txt");
//        System.out.println(f1.createNewFile());

//        File f2 = new File("D:\\develop\\java\\file\\newDir");
//        f2.mkdir();
//        f2.delete();

//        File f3 = new File("javaIO");
//        f3.mkdir();


        //创建字节输出流对象
//        FileOutputStream fos = new FileOutputStream("javaIO\\outputFile.txt");
        FileOutputStream fos = new FileOutputStream("javaIO\\outputFile.txt",true);

//        fos.write(97);
//        fos.close();

        //写入字节数组
//        byte[] by = {97,98,99};
//        fos.write(by);

        //字符串转字节数组
//        byte[] by1 = "xyz刘 \n".getBytes();
//        fos.write(by1);
//        fos.close();

        //读取一个字符，并转为char型,输出
        FileInputStream fis = new FileInputStream("javaIO\\outputFile.txt");
//        int by = fis.read();
//        System.out.println((char) by);

        //读完 可以不换行
        int temp;
        while((temp = fis.read()) != -1 ){
            System.out.print((char) temp);
        }

        fis.close();
    }
}
