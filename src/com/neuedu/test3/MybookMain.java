package com.neuedu.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bin
 * @date 2020/2/11 0011 9:21
 */
public class MybookMain {
    public static Mybook[] mybooks = new Mybook[200];
    public static List<Mybook> list= new ArrayList<>();


    public static void main(String[] args) {
        inputData(list);
        menu();
    }

    // 菜单栏
    public static void menu(){
        System.out.println("============");
        System.out.println("请选择你要进行的操作(请输入数字1-5选择功能)：");
        System.out.println("1.添加图书");
        System.out.println("2.删除图书");
        System.out.println("3.查找图书");
        System.out.println("4.查看所有");
        System.out.println("5.退出");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case  1:
                addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的书名：");
                String deleteName = scanner.next();
                deleteName(list,deleteName);
                break;
            case 3:
                System.out.println("请输入要查看的书名：");
                String searchName = scanner.next();
                searchName(list,searchName);
                break;
            case 4:
                print(list);
                break;
            case 5:
                System.exit(1);
                break;
        }
    }

    // 输入功能
    public static void inputData(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            Mybook mybook = new Mybook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"ISBN"+i);
            books.add(mybook);
        }
    }

    // 打印功能
    public static void print(List<Mybook> books){
        System.out.println("============");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        menu();
    }

    // 查找功能
    public static void searchName(List<Mybook> books,String name){
        for (int i = 0; i < books.size(); i++) {
            Mybook mybook = books.get(i);
            if(name.equals(mybook.getName())){
                System.out.println("============");
                System.out.println(mybook);
                menu();
                return;
            }
        }
        System.out.println("============");
        System.out.println("此书不存在");
        menu();
    }

    // 删除功能
    public static void deleteName(List<Mybook> books,String name){
        for (int i = 0; i < books.size(); i++) {
            Mybook mybook = books.get(i);
            if(name.equals(mybook.getName())){
                books.remove(mybook);
                System.out.println("============");
                System.out.println("此书删除成功");
                System.out.println(mybook);
                menu();
                return;
            }
        }
        System.out.println("============");
        System.out.println("没有此书，删除失败");
        menu();
    }

    // 添加功能
    public static void addBook(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("============");
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入价格：");
        Double price = scanner.nextDouble();
        System.out.println("请输入出版社：");
        String press = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入ISBN：");
        String ISBN = scanner.next();
        Mybook mybook = new Mybook(name,price,press,author,ISBN);
        books.add(mybook);
        menu();
    }
}
