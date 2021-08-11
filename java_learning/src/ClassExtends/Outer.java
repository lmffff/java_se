package ClassExtends;

public class Outer {
    private int num = 10;
    public class Inner{
        public void show(){    //内部类可以直接访问外部类
            System.out.println("num:"+num);
        }
    }

    public void method(){
//        show();    外部类不可以直接访问内部类
        Inner i = new Inner();
        i.show();

    }

}
