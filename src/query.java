public class query {
    //数组的好处就是快
    public static int query(int s, int[] arr){
        return arr[s];
    }

    public static void query2(int n, int[] arr){
        //如果找不到的话， 就给出-1
        int index=-1;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]==n){
                index = i;
                break;
            }
        }
        if(index>=0){
            System.out.println("It is in the "+index+"place");
        }else{
            System.out.println("Not found");
        }
    }

}
