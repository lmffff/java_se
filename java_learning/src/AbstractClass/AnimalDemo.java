package AbstractClass;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        AnimalAbstract a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("---------------------");
        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
