package Others;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input score");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.check((score));  //check函数中定义抛出异常的条件
        } catch (ExceptionClass e) {
            e.printStackTrace();
        }
    }
}
