package basic.leasson2;

import java.util.Scanner;

//Scanner 类实例演示
public class ScannerDemo {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scan.next();

        System.out.println("请输入年龄：");
        int age = scan.nextInt();

        System.out.println("输入的姓名是："+ name);

        System.out.println("你输入的年龄是："+ age + "岁");

    }


}
