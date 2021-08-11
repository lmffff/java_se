package ClassExtends;

public class Dog extends Animal {
    public static String className = "dog";
    public String name;
    public Dog(){
        System.out.println("dog 无参构造");
    }
    public Dog(String aa){
        name = aa;
        System.out.println("dog 有参构造");
        System.out.println("your dog's name is "+aa);
     }
    public void show(){
        System.out.println(this.className);
        System.out.println("belongs to " + super.className);
    }
    @Override
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void spark(){
        System.out.println("汪汪！");
    }
}
