package interfaceLearn;

import ClassExtends.Animal;

public class Dog extends Animal implements Jumping{

    public Dog() {
    }

    public Dog(int aa) {
        super(aa);
    }

    @Override
    public void jump() {
        System.out.println("狗跳高");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("狗吃肉");
    }
}
