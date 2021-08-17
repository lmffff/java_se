package List;

import java.util.TreeSet;
//按年龄顺序存储对象
public class StudentCompareTest {
    public static void main(String[] args) {
        StudentCompare s1 = new StudentCompare("貂蝉",22);
        StudentCompare s2 = new StudentCompare("西施",21);
        StudentCompare s3 = new StudentCompare("王昭君",24);
        StudentCompare s4 = new StudentCompare("杨玉环",23);

        TreeSet<StudentCompare> stdSet = new TreeSet<>();
        stdSet.add(s1);
        stdSet.add(s2);
        stdSet.add(s3);
        stdSet.add(s4);

        for (StudentCompare s:stdSet){
            System.out.println(s.name+","+s.age);
        }
    }
}
