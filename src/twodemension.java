public class twodemension {
    public static void main(String[] args) {
        int[][] arr;
        int[][] arr4 = new int[3][];
        int[][] arr2 = new int[3][3];
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        arr4[0] = a;
        arr4[1] = b;
        arr4[2] = new int[]{1,2,3,4};

        for(int[] e: arr4){
            for(int num:e){
                System.out.println(num);
            }
        }
    }



}
