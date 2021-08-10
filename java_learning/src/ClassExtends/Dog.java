package ClassExtends;

public class Dog extends Animal {
    public String className = "Dog";

    public Dog(){
        legsCount = 4;
    }

    public void show(){
        System.out.println(this.className);
        System.out.println("belongs to " + super.className);
    }

    public void spark(){
        System.out.println("汪汪！");
    }
}
