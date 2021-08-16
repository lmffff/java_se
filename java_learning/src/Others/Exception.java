package Others;

public class Exception {
    public static void main(String[] args) {
        int[] aa = {0,1,2};
        System.out.println("before exception");
//        System.out.println(aa[3]);
        try{
            System.out.println(aa[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("-----");
            System.out.println(e.toString());
            System.out.println("-----");
            e.printStackTrace();
        }
        System.out.println("after exception");
    }
}
