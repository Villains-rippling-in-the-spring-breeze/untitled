package 流程控制结构.分支控制;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符（a-g）");
        char c1=sc.next().charAt(0);
        switch (c1){
            case'a':
                System.out.println("今天星期一");
                break;
            case'b':
                System.out.println("今天星期二");
                break;
            case'c':
                System.out.println("今天星期三");
                break;
            case'd':
                System.out.println("今天星期四");
                break;
            case'e':
                System.out.println("今天星期五");
                break;
            case'f':
                System.out.println("今天星期六");
                break;
            case'g':
                System.out.println("今天星期七");
                break;
            default:
                System.out.println("你的输入语句有误");
                break;

        }

    }


}
