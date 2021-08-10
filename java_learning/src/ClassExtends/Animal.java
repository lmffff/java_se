package ClassExtends;

public class Animal {
    public int legsCount;
    public static String className = "animal" ;
    private boolean canRun;


    public Animal(){
        System.out.println("animal 无参构造");
    }
    public Animal(int aa){
        System.out.println("animal 有参构造");
        legsCount = aa;
    }
    public void sleep(){
        System.out.println("go to sleep");
    }
    public void eat(){
        System.out.println("eat something");
    }
}
