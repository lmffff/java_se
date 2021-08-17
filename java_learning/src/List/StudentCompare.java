package List;

public class StudentCompare implements Comparable<StudentCompare>{
    String name;
    int age;

    public StudentCompare(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentCompare o) {

        int num = this.age - o.age;
        return num;
    }
}
