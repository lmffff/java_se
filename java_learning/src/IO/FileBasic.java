package IO;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileBasic {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\develop\\java\\file\\javaIO.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("D:\\develop\\java\\file\\newDir");
//        f2.mkdir();
        f2.delete();

    }
}
