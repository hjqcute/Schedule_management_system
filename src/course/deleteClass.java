package course;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 功能：实现在文件中删除指定的课程
 */
public class deleteClass {
    String[] classInfo1 = new String[11];
    String[] classInfo2 = new String[11];
    public void delete(String className) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ClassInfo.txt"));
        String tempString;///定义一个字符串，每一次读出该行字符串内容
        ArrayList<String> list = new ArrayList<>();//定义一个list字符串集合用来储存每一行的字符串信息
        while((tempString = br.readLine()) != null) {
            list.add(tempString);
            //System.out.println(tempString);
        }

        /*
        //遍历字符串集合输出当前存在的课程
        System.out.println("---------当前课程有----------");
        for (String aClass : list) {
            classInfo1 = aClass.split(",");//将‘,‘作为分隔符，将字符串分隔开存放进入数组中
            System.out.print(classInfo1[1] + " ");
        }
        System.out.println("");

        //输入要删除的内容
        System.out.println("请输入要删除的书籍名称：");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        */

        //判断是否存在该课程
        boolean have = false;
        for (String aClass : list) {
            classInfo1 = aClass.split("-");
            //找到即将删除的课程在集合中的位置，将该部分内容从集合中删除，然后清空整个文件
            if(className.equals(classInfo1[1])) {
                have = true;
                list.remove(aClass);//在集合中删除该行
                BufferedWriter bw = new BufferedWriter(new FileWriter("ClassInfo.txt", false));
                bw.write("");//执行删除操作，写入空内容覆盖之前的内容
                bw.close();
                break;
            }
        }
        if(have == false) {
            System.out.println("课程不存在");
            return;
        }
        for (String delClass : list) {
            classInfo2 = delClass.split("-");
            FileWriter fw = new FileWriter("ClassInfo.txt", true);//append传入true表示写入内容时将不会覆盖文件中之前存在的内容，将新的内容写在之前内容的后面
            fw.write(classInfo2[0] + "-" + classInfo2[1] +
                    "-" + classInfo2[2] + "-" + classInfo2[3] +
                    "-" + classInfo2[4] + "-" + classInfo2[5] +
                    "-" + classInfo2[6] + "-" + classInfo2[7] +
                    "-" + classInfo2[8] + "-" + classInfo2[9] +
                    "-" + classInfo2[10]);//执行重新写入内容的操作，将修改过的集合通过数组读下标后，再重新存写入文件中
            fw.write(System.getProperty("line.separator"));//在段落后添加一个换行符
            fw.close();
        }
        System.out.println("删除成功！");
    }
}
