package course;

import javax.servlet.http.HttpServlet;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class classTest extends HttpServlet {
    public static void main(String[] args) throws IOException {
        ArrayList<Class> list = new ArrayList<>();
        System.out.println("----------欢迎来到课程管理系统！----------");
        System.out.println("1.添加课程");
        System.out.println("2.删除课程");
        System.out.println("3.修改课程信息");
        System.out.println("4.查询课程信息");
        System.out.println("5.退出");
        System.out.println("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            String choose = sc.next();//没有定义int型，可以应对输入错误的情况
            switch (choose) {
                case "1" -> addClass(list);
                case "2" -> deleteClass(list);
                case "3" -> updateClass(list);
                case "4" -> queryClass(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("发生错误");
            }
        }
    }

    /*
        queryClass
        功能：查询课程信息
    */
    private static void queryClass(ArrayList<Class> list) {
        System.out.println("查询课程信息");
        if(list.size() == 0) {
            System.out.println("当前无课程信息，请先进行添加操作");
            return ;
        }
        System.out.println("1.显示全部课程信息");
        System.out.println("2.查询单独课程信息");
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            choice = sc.nextInt();
            if(choice == 1) {
                System.out.println("id\t姓名\t\t开始时间\t\t结束时间\t\t持续时间\t\t教师\t\t地点");
                for (int i = 0; i < list.size(); i++) {
                    Class c = list.get(i);
                    System.out.println(c.getClassId() + "\t" + c.getClassName() + "\t\t"
                            + c.getClassBeginTime() + "\t\t" + c.getClassEndTime() + "\t\t" + c.getDuration() + "\t\t"
                            + c.getClassTeacher() + "\t\t" + c.getClassLocation());
                }
                break;
            } else if(choice == 2) {
                System.out.println("请输入想要查询的课程编号");
                int searchId = sc.nextInt();
                Class c = list.get(searchId - 1);
                System.out.println("id\t姓名\t\t开始时间\t\t结束时间\t\t持续时间\t\t教师\t\t地点");
                System.out.println(c.getClassId() + "\t" + c.getClassName() + "\t\t"
                        + c.getClassBeginTime() + "\t\t" + c.getClassEndTime() +  "\t\t" + c.getDuration() + "\t\t"
                        + c.getClassTeacher() + "\t\t" + c.getClassLocation());
                break;
            } else {
                System.out.println("发生错误");
            }
        }
    }

    /*
        uodateClass
        功能：修改课程信息
    */
    private static void updateClass(ArrayList<Class> list) {
        System.out.println("修改课程信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的课程的id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index >= 0) {
            Class c = list.get(index);
            System.out.println("请输入课程的姓名：");
            String newName = sc.next();
            c.setClassName(newName);
            System.out.println("请输入课程的开始时间：");
            int beginTime = sc.nextInt();
            c.setClassBeginTime(beginTime);
            System.out.println("请输入课程的结束时间：");
            int endTime = sc.nextInt();
            c.setClassEndTime(endTime);
            System.out.println("请输入课程的持续时间：");
            int duration = sc.nextInt();
            c.setDuration(duration);
            System.out.println("请输入课程的上课教师：");
            String newTeacher = sc.next();
            c.setClassTeacher(newTeacher);
            System.out.println("请输入课程的上课地点：");
            String newLocation = sc.next();
            c.setClassLocation(newLocation);
        } else {
            System.out.println("id不存在，修改失败");
        }
    }

    /*
        delete
        Class功能：删除课程
    */
    private static void deleteClass(ArrayList<Class> list) {
        System.out.println("删除课程");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的课程的id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的课程删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    /*
        addClass
        功能：添加课程
    */
    private static void addClass(ArrayList<Class> list) throws IOException {
        System.out.println("添加课程");
        Class c = new Class();
        Scanner sc = new Scanner(System.in);
        //通过课程id查重
        String classId = null;
        while (true) {
            System.out.println("请输入课程的ID：");
            classId = sc.next();
            if(contains(list, classId)) {
                System.out.println("课程ID重复，请重新录入：");
            }
            else {
                c.setClassId(classId);
                break;
            }
        }
        //进一步补充课程信息
        System.out.println("请输入课程的姓名：");
        String newName = sc.next();
        c.setClassName(newName);
        System.out.println("请输入课程的上课周数：");
        String week = sc.next();
        c.setClassWeek(week);
        System.out.println("请输入课程的开始时间：");
        int beginTime = sc.nextInt();
        c.setClassBeginTime(beginTime);
        System.out.println("请输入课程的结束时间：");
        int endTime = sc.nextInt();
        c.setClassEndTime(endTime);
        System.out.println("请输入课程的持续时间：");
        int duration = sc.nextInt();
        c.setDuration(duration);
        System.out.println("请输入课程的上课教师：");
        String newTeacher = sc.next();
        c.setClassTeacher(newTeacher);
        System.out.println("请输入课程的上课地点：");
        String newLocation = sc.next();
        c.setClassLocation(newLocation);
        list.add(c);
        //写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("ClassInfo.txt",true));
        bw.write(classId + "-" + newName + "-" + week + "-" + beginTime + "-" + endTime + "-"
                + duration + "-" + newTeacher + "-" + newLocation);
        bw.newLine();
        bw.close();
        System.out.println("课程信息添加成功");
    }

    /*
        contains
        功能：检测id是否唯一
    */
    private static boolean contains(ArrayList<Class> list, String newId) {
        return getIndex(list, newId) >= 0;
    }

    /*
        getIndex
        功能：通过id获得课程索引
    */
    public static int getIndex(ArrayList<Class> list, String newId) {
        for (int i = 0; i < list.size(); i++) {
            String id = list.get(i).getClassId();
            if(newId.equals(id))    return i;
        }
        return -1;
    }
}