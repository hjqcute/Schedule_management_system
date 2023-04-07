package map;

public class Menu {
    public static void MainMenu(){
        System.out.println("==============================");
        System.out.println("------------主菜单-------------");
        System.out.println("----------1.进入导航系统--------");
        System.out.println("----------2.学校简介-----------");
        System.out.println("----------0.退出程序-----------");
        System.out.println("==============================");
    }//主菜单界面
    public static void Navigation(){
        System.out.println("==============================");
        System.out.println("====欢迎使用校园导航系统=====");
        System.out.println("请选择操作：\nA.显示学校所有景点\nB.查询学校地点位置信息\nC.查询任意两地点之间最短路径\n0.返回主界面");
        System.out.println("==============================");
    }//导航系统菜单
    public static void SchoolProfile(){
        System.out.println("*****************************************");
        System.out.println("*简介待补充*");
        System.out.println("*****************************************");
    }//学校简介信息
    public static void back(){
        System.out.println("已自动回到主菜单！");
        MapSchool origin = new MapSchool();
        origin.main(new String[]{});
    }//直接返回主菜单的操作
}

