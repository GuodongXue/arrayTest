import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr = {12, 34, 24, 56, 78};
        int[] arr1 = {12, 34, 24, 56, 78};
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] newArray = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.equals(arr, arr1));
        int[] a ={1,2,3,4,5,6,7,8,9,0};
        int[] b= new int[10];
        System.arraycopy(a,2,b,3,4);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}