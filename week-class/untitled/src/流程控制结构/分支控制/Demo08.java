package 流程控制结构.分支控制;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        text05();//调用
    }

    public static void text01() {
        //计算不使用以旧换新的花费
        int money1 = 7988 - 1500;
        //就算以旧换新的花费
        double money2 = 7988 * 0.8;
        //判断两种方式
        if (money1 > money2) {
            System.out.println("以旧换新更省钱");
        } else {
            System.out.println("不以旧换新省钱");
        }
    }

    public static void text02() {
        //让用户依次录入三个整数，求出三个数中最小值，并打印到控制台
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数");
        int k = sc.nextInt();
        //定义一个变量代表最小值
        int min;
        if (i > j && j < k) {//i<j&&j<k
            min = j;
        } else if (i > j && j > k) {
            min = k;
        } else {
            min = i;
        }
        //打印最小值
        System.out.println(min);

    }

    @Test

    public static void text03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的存储金额");
        int money = sc.nextInt();
        System.out.println("请输入你的存款年限");
        int year = sc.nextInt();
        //定义一个本息和
        double outmoney = 0;
        //根据年里率去计算本息和
        if (year == 1) {
            outmoney = money + money * 2.25 / 100 * 1;
        } else if (year == 2) {
            outmoney = money + money * 2.7 / 100 * 2;
        } else if (year == 3) {
            outmoney = money + money * 3.25 / 100 * 3;
        } else if (year == 5) {
            outmoney = money + money * 3.6 / 100 * 5;
        } else {
            System.out.println("输入的年限有误");
        }
        System.out.println("存款" + year + "年后的本息为" + outmoney);

    }

    public static void text04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的顾客类别{0表示的是普通顾客，1表示的是会员顾客}");
        int type = sc.nextInt();
        System.out.println("请输入你的购物金额");
        int money = sc.nextInt();
        //先判断顾客的类别
        if (type == 0) {
            //普通顾客，在判断购物金额
            if (money > 0 && money < 100) {
                System.out.println("应付的金额为" + money);
            } else if (money > 100) {
                System.out.println("应付的金额为" + money);
            } else {
                System.out.println("你输入的金额有误");
            }
        } else if (type == 1) {
            //会员顾客，在判断购物的金额
            if (money > 0 && money < 200) {
                System.out.println("应付的金额为" + money * 0.8);
            } else if (money >= 200) {
                System.out.println("应付的金额为" + money * 0.75);
            } else {
                System.out.println("你输入的金额有误");
            }

        } else {
            System.out.println("那你输入的顾客类别有误");
        }

    }

    public static void text05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的税前工资");
        int money = sc.nextInt();
        //计算应缴税部分的工资
        double before = money - (money * 0.1) - 5000;
        //定义个税变量
        double Individual_taxes = 0;
        if (before > 0 && before <= 3000) {
            Individual_taxes = before * 0.03;

        } else if (before > 3000 && before <= 12000) {
            Individual_taxes = 3000 * 0.03 + (before - 3000) * 0.1;
        } else if (before > 12000 && before <= 25000) {
            Individual_taxes = 3000 * 0.03 + 9000 * 0.1 + (before - 12000) * 0.2;

        } else if (before > 25000 && before <= 35000) {
            Individual_taxes = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (before - 25000) * 0.25;

        } else if (before > 35000 && before <= 55000) {
            Individual_taxes = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 100000 * 0.25 + (before - 35000) * 0.3;

        } else if (before > 55000 && before <= 800000) {
            Individual_taxes = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 100000 * 0.25 + 20000 * 0.3 + (before - 55000) * 0.35;

        } else if (before > 800000) {
            Individual_taxes = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 100000 * 0.25 + 20000 * 0.3 + 250000 * 0.35 + (before - 800000) * 0.45;

        }
        //计算税后工资为
        double after=money-(money*0.1)-Individual_taxes;
        //打印个税和税后工资
        System.out.println("个人所得税为"+Individual_taxes+"元");
        System.out.println("税后工资"+after+"元");

    }
}

