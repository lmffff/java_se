package ClassExtends;

public abstract class Animal {
    public String name;
    public int age;
    public static String className = "animal" ;


    public Animal(){
        System.out.println("animal 无参构造");
    }
    public Animal(int aa){
        System.out.println("animal 有参构造");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();


}
