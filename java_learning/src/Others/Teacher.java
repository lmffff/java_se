package Others;

import java.util.Scanner;
//写出异常条件，并在check方法中写出判断异常的条件
public class Teacher {
    public void check(int score) throws ExceptionClass{
        if(score<0 || score>100){
            throw new ExceptionClass("分数有误,应在0-100之间");
        } else {
            System.out.println("no exception");
        }
    }
}
