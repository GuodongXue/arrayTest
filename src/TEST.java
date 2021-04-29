import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        int[] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i<=10; i++){
            System.out.println("Input the "+i+"student's score");
            int score = sc.nextInt();
            scores[i-1] = score;
            sum+= score;
        }
        System.out.println("The sum is"+sum);
        System.out.println("The average is"+(sum/10));
        System.out.println(scores[5]);
        for(int i=0; i<=scores.length-1; i++){
            System.out.println(scores[i]);
        }
        //foreach
        for(int s:scores){
            //循环的每一次都在控制台打印
            System.out.println(s);
            //缺点是不能进行和索引相关的东西
            //一句的for 循环可以不写花括号
        }
        //逆向遍历
        for (int i = scores.length-1; i>-0; i--){
            System.out.println(scores[i]);
        }


    }
}
