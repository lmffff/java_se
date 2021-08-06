package ArrayList;

import Basic.Student;

import java.util.ArrayList;


public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println("array: "+array);

        //删除元素object，返回true表示删除成功
//        System.out.println(array.remove("world"));  //

        //删除index处的元素，返回被删除的元素
//        System.out.println(array.remove(2));

        //修改指定索引的元素
//        System.out.println(array.set(2,"python"));
//        System.out.println(array);

        //返回指定索引处元素
//        System.out.println(array.get(1));

        //返回长度
//        System.out.println(array.size());

        //遍历集合元素
//        for(int i = 0;i < array.size();i++){
//            System.out.println(array.get(i));
//        }

        //创建学生集合,并show
        ArrayList<Student> arrayStd = new ArrayList<>();
        Student s1 = new Student("joey",8);
        Student s2 = new Student("monica",26);
        Student s3 = new Student("rachel",26);
        arrayStd.add(s1);
        arrayStd.add(s2);
        arrayStd.add(s3);
        for(int i = 0;i < arrayStd.size();i++){
            Student st = arrayStd.get(i);
            st.show();
        }

    }
}
