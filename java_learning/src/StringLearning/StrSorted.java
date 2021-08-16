package StringLearning;

import Others.BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

//输入一个字符串 对其中的int值排序 然后以字符串形式输出
public class StrSorted {
    public static void main(String[] args) {
        String str = "4 2 11 3 5";
        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];
        for(int i = 0; i< strArr.length;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        BubbleSort.bubble(arr);
        String strSorted = "";
        for(int i = 0; i< strArr.length;i++){
            strSorted += String.valueOf(arr[i])+" ";
        }
        System.out.println(strSorted);

    }
}
