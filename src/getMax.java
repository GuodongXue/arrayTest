public class getMax {
    public static int getMax(int[] arr){
        int max =0;
        int maxindex = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>= max){
                max = arr[i];
                maxindex = i;
            }
        }
        return max;
    }

}
