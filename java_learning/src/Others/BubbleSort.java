package Others;
import java.util.Arrays;


//分别使用手写冒泡排序和Arrays自带方法进行数组排序

public class BubbleSort {
    public static void main(String[] args) {
        long begin1 = System.currentTimeMillis();
        int[] arr = {6,2,7,4,3};
        bubble(arr);
        long end1 = System.currentTimeMillis();

        System.out.println(arr2String(arr));
        System.out.println("手写冒泡排序耗时"+ (end1 - begin1) + "ms");

        //利用Arrays自带方法: sort()、toString()
        long begin2 = System.currentTimeMillis();
        int[] arr1 = {6,2,7,4,3};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        long end2 = System.currentTimeMillis();
        System.out.println("调用系统函数耗时"+ (end2 - begin2) + "ms");

    }


    public static void bubble(int[] aa){
        int len = aa.length;
        for(int i=0;i<len-1;i++){
            for(int j = 0;j<len - 1 -i;j++){
                if(aa[j+1]<aa[j]){
                    int temp = aa[j+1];
                    aa[j+1] = aa[j];
                    aa[j] = temp;
                }
            }
        }
    }

    public static String arr2String(int[] arr){
        String str = "";
        str = str+'[';
        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i]+',');
            if(i == arr.length-1){
                str = str + arr[i];
            }else {
                str = str + arr[i] + ',';
            }
        }
        str = str + ']';
        return str;
    }
}
