package StringLearning;

public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = arr2str(arr);
        System.out.println("arr is: "+s);

    }

    public static String arr2str(int[] arr){
        String s = "";
        s += "[";
        for (int i =0;i<arr.length;i++){
            if(i == arr.length - 1){
                s+=arr[i];
            }else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;

    }
}
