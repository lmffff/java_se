package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileContent {
    public static void main(String[] args) throws IOException {
        File co = new File("javaIO\\copyFrom.txt");
        File pa = new File("javaIO\\copyTo.txt");
        co.createNewFile();
        pa.createNewFile();

        FileOutputStream fos = new FileOutputStream(co);
        fos.write("jyzdq".getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(co);
        FileOutputStream fos1 = new FileOutputStream(pa);
        int temp;
        while((temp = fis.read())!=-1){
            fos1.write(temp);
        }
        fis.close();
        fos1.close();
    }

}
