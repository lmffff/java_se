package interfaceLearn;
import ClassExtends.Animal;

public class Cat  extends Animal implements Jumping{

    public Cat() {
    }

    public Cat(int aa) {
        super(aa);
    }

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("猫吃鱼");
    }
}
