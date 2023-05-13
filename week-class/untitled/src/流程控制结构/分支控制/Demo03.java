package 流程控制结构.分支控制;

public class Demo03 {
    public static void main(String[] args) {
        /*
        1) 编写程序，声明2 个double 型变量并赋值。判断第⼀个数⼤于10.0，且第2 个数⼩于20.0，打印两数之和
         */
        double a = 13.3;
        double b = 15.5;
        if (a > 10.0 && b < 20.0) {
            System.out.println(a + b);
        }


    /*
    2) 【课后⾃⼰练】定义两个变量int，判断⼆者的和，是否能被3 ⼜能被5 整除，打印提示信息
     */

    int num1 = 10;
    int num2 = 15;
    int sum = num1 + num2;
        if(sum %3==0&&sum %5==0)

    {
        System.out.println("和可以被3同时被5整除");
    } else

    {
        System.out.println("和不可以被3同时被5整除");
    }

    /*
    3) 判断⼀个年份是否是闰年，闰年的条件是符合下⾯⼆者之⼀：(1)年份能被4 整除，但不能被100 整除；(2)能
      被400整除
     */
    int year = 2024;
         if(year%4==0&&year%100!=0||year%400==0)

    {
        System.out.println(year + "为闰年");
    }else {
             System.out.println(year+"不是闰年");
         }
    }


}
