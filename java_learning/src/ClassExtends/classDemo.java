package ClassExtends;

public class classDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("胖虎");
        Dog.className = "dog";
        System.out.println(dog1.className);
        System.out.println(dog2.className);

//        dog1.sleep();
//        dog1.spark();
//        dog1.show();
    }
}
