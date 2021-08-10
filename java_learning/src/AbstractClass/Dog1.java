package AbstractClass;

public class Dog1 extends AnimalAbstract {
    public Dog1() {
    }

    public Dog1(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
