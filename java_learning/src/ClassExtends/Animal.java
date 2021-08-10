package ClassExtends;

public class Animal {
    public int legsCount;
    public String className = "animal";
    private boolean canRun;

    public int getLegsCount() {
        return legsCount;
    }

    public void sleep(){
        System.out.println("go to sleep");
    }
    public void eat(){
        System.out.println("eat something");
    }
}
