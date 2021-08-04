import java.util.Scanner;

//定义一个标准类，包括成员函数、成员变量（私有）、构造方法、成员方法  20210804 
public class Student {
    private String name;
    private int age;
    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void show(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);

    }



}
