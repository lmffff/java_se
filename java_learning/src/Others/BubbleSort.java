package Others;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,2,7,4,3};
        int[] arrSorted = bubble(arr);
        System.out.println(arr2String(arr));
        System.out.println(arr2String(arrSorted));

    }


    public static int[] bubble(int[] aa){
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
        return aa;
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
