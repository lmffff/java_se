package interfaceLearn;

import ClassExtends.Animal;

public class JumpingDemo {
    public static void main(String[] args) {
        System.out.println("----Jumping j = new Cat();-----");
        Jumping j = new Cat();   //多态
        j.jump();
        System.out.println("----Animal a = new Cat();-----");
        Animal a = new Cat();   //多态
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump();    //报错！
        ((Cat)a).jump(); //不报错
        System.out.println("----Cat ca = new Cat();-----");
        //标准写法：
        Cat ca = new Cat();   //子类
        ca.setName("咪咪");
        ca.setAge(2);
        System.out.println(a.getName()+","+a.getAge());
        ca.eat();
        ca.jump(); //不报错

    }
}
