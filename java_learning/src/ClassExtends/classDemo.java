package ClassExtends;

public class classDemo {
    public static void main(String[] args) {
//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog("胖虎");
//        Dog.className = "dog";
//        System.out.println(dog1.className);
//        System.out.println(dog2.className);

//        dog1.sleep();
//        dog1.spark();
//        dog1.show();
        //多态先访问父类
        Animal dog3 = new Dog();
        System.out.println("dog3 className: "+dog3.className);
        dog3.eat();   //子类 狗吃肉
//        dog3.spark();    //   报错！！ 子类特有
        Dog d = (Dog) dog3;   //强制向下转换
        d.spark();
    }
}
