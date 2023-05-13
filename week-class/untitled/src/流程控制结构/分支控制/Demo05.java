package 流程控制结构.分支控制;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        /*
参加歌⼿⽐赛，如果初赛成绩⼤于8.0 进⼊决赛，否则提示淘汰。并且根据性别提示进⼊男⼦组或⼥⼦组。【可以
让学员先练习下】, 输⼊成绩和性别，进⾏判断和输出信息。[NestedIf.java]
提示: double score; char gender;
接收字符: char gender = scanner.next().charAt(0)
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的初赛成绩");
        double score= sc.nextDouble();
        if(score>8.0){

            System.out.println("输入你的性别");
            char sex=sc.next().charAt(0);
            if(sex=='男'){
                System.out.println("请到男子组");
            }else if(sex=='女'){
                System.out.println("请到女子组");
            }else {
                System.out.println("不好意思你的性别有误");
            }

        }else {
            System.out.println("淘汰");
        }
        //嵌套分支


    }
}
