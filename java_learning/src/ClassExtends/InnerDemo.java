package ClassExtends;

public class InnerDemo {
    public static void main(String[] args) {
//        private修饰内部类时不能这样调用
//        Outer.Inner in = new Outer().new Inner();
//        in.show();

        Outer out = new Outer();
        out.method();
    }
}
