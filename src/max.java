public class max {
    public static void main(String[] args) {
        //给定一个数组
        int[] arr={12,23, 4, 967, 78, 4, 888};
        //同一个包下， 类名加方法名直接调用
        int max = getMax.getMax(arr);
        System.out.println(max);
        query.query2(889, arr);

    }
    //int...arr可变数量的形式参数， 但是实际上内部都当做参数在使用
    public static void add(int a,int...arr){
        //传可变和其他的类型一起的时候， 可变一定得放在最后
        for(int num:arr){
            System.out.println(num);
        }
    }


}
