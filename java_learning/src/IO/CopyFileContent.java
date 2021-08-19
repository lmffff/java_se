package IO;

import java.io.*;

// 用字节流复制、用fileWriter、fileReader定义（只是简化了定义过程，写入方式不变）+字符数组写入
public class CopyFileContent {
    public static void main(String[] args) throws IOException {
        File co = new File("javaIO\\copyFrom.txt");
        File pa = new File("javaIO\\copyTo.txt");
        co.createNewFile();
        pa.createNewFile();

        FileOutputStream fos = new FileOutputStream(co);
        fos.write("jyzdqdsuhdagfiuegi".getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(co);
        FileOutputStream fos1 = new FileOutputStream(pa);
        int temp;
        while((temp = fis.read())!=-1){
            fos1.write(temp);
        }
        fis.close();
        fos1.close();

        FileReader fr = new FileReader("javaIO\\copyFrom.txt");
        FileWriter fw = new FileWriter("javaIO\\copyTo.txt");
        char[] chs = new char[1024];
        int len;
        while((len = fr.read(chs))!=-1){
            fw.write(new String(chs,0,len));
        }
        fr.close();
        fw.close();


    }

}
