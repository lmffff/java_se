package interfaceLearn;
//当我们想使用一个接口中的方法时，不需要重写一个文件实现接口，可以直接写一个以该接口为参数的调用函数，
// 并使用匿名内部类或lambda表达式的方式快速调用一个新的接口对象
//区别：匿名内部类可以在参数列表新建一个对象（包括类和接口），但lambda表达式（仅限接口）
public class lambdaDemo {
    public static void main(String[] args) {

        //方法一：匿名内部类
        useLambda(new lambdaInter() {
            @Override
            public void lam(String s) {
                System.out.println(s);
            }
        });

        //方法二：lambda表达式
        useLambda(s -> System.out.println(s));

        //方法三：lambda表达式 方法引用 版
//        useLambda(System.out::println);

    }

    public static void useLambda(lambdaInter li){
        li.lam("useLambda调用接口中的抽象方法");
    }
}
