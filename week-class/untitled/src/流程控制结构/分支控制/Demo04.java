package 流程控制结构.分支控制;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//键盘输入对象
        System.out.println("输⼊保国同志的芝麻信⽤分：");
       double score=sc.nextDouble();
       if(score>=1&&score<=100){
           if(score==100){
               System.out.println("信用极好");
           }
           else if(score>80&&score<=99){
               System.out.println("信用优秀");

           }
           else if (score>=60&&score<=80){
               System.out.println("信用一般");
           }
           else{
               System.out.println("信用不及格");
           }
       }else {
           System.out.println("请好好输入你的芝麻信用分");
       }


    }
    /*
案例演示1
请⼤家看个案例[If03.java]:
        输⼊保国同志的芝麻信⽤分：
        如果：
        1) 信⽤分为100 分时，输出信⽤极好；
        2) 信⽤分为(80，99]时，输出信⽤优秀；
        3) 信⽤分为[60,80]时，输出信⽤⼀般；
        4) 其它情况，输出信⽤不及格
        5) 请从键盘输⼊保国的芝麻信⽤分，并加以判断
*/

}
