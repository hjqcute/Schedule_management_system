package activity;

import course.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class activityTest {
    public static void main(String[] args) {
        ArrayList<Activity> list = new ArrayList<>();
        System.out.println("----------欢迎来到活动管理系统！----------");
        System.out.println("1.添加活动");
        System.out.println("2.删除活动");
        System.out.println("3.修改活动信息");
        System.out.println("4.查询活动信息");
        System.out.println("5.退出");
        System.out.println("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            String choose = sc.next();//没有定义int型，可以应对输入错误的情况
            switch (choose) {
                case "1" -> addActivity(list);
                case "2" -> deleteActivity(list);
                case "3" -> updateActivity(list);
                case "4" -> queryActivity(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("发生错误");
            }
        }
    }

    private static void queryActivity(ArrayList<Activity> list) {

    }

    private static void updateActivity(ArrayList<Activity> list) {

    }

    private static void deleteActivity(ArrayList<Activity> list) {

    }

    private static void addActivity(ArrayList<Activity> list) {

    }
}
