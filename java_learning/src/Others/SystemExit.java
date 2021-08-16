package Others;

import ClassExtends.Dog;

public class SystemExit {
    public static void main(String[] args) {
        System.out.println("begin");
//        System.exit(0);
        System.out.println("end");  //不会输出

        //输出运行时间ms
//        long beginTime = System.currentTimeMillis();
//        for(int i = 0; i<10000;i++){
//            System.out.println(i);
//        }
//        long endTime = System.currentTimeMillis()-beginTime;
//        System.out.println(endTime+"ms");


        //重写Object中的equals方法
        Dog dog1 = new Dog("金毛");
        Dog dog2 = new Dog("金毛");

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

    }
}
