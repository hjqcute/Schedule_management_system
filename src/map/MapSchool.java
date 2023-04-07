package map;

import java.util.Map;
import java.util.Scanner;

public class MapSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //构造无向图
        Menu.MainMenu();
        Attraction attraction0 = new Attraction(0,"主楼","位于教一楼和教二楼的中间",116.352220,39.959880,null);
        Attraction attraction1 = new Attraction(1,"教一楼","大致位于整个校园的中央",116.381855,39.960695,null);
        Attraction attraction2 = new Attraction(2,"教二楼","位于南门的东北部",116.351915,39.959205,null);
        Attraction attraction3 = new Attraction(3,"教三楼","位于南门的西北部",116.350245,39.959050,null);
        Attraction attraction4 = new Attraction(4,"教四楼","位于西门的正东部",116.350140,39.960580,null);
        Attraction attraction5 = new Attraction(5,"体育馆","位于东门的正西部",116.413555,39.959880,null);
        Attraction attraction6 = new Attraction(6,"体育场","位于体育馆的南部",116.413555,39.960580,null);
        Attraction attraction7 = new Attraction(7,"图书馆","位于教一楼的北部",116.352220,39.961510,null);
        Attraction attraction8 = new Attraction(8,"校训石","位于教三楼和教四楼的中间",116.350200,39.959880,null);
        AttractionGraph graph = new AttractionGraph();
        graph.add(attraction0);graph.add(attraction1);graph.add(attraction2);
        graph.add(attraction3);graph.add(attraction4);graph.add(attraction5);
        graph.add(attraction6);graph.add(attraction7);graph.add(attraction8);
        //插入数据
        graph.get(0).setNext(new GraphNode(1,20,null));
        graph.get(0).getNext()
                .add(new GraphNode(2,20,null))
                .add(new GraphNode(6,50,null));
        graph.get(1).setNext(new GraphNode(0,20,null));
        graph.get(1).getNext()
                .add(new GraphNode(4,20,null))
                .add(new GraphNode(5,50,null))
                .add(new GraphNode(7,30,null));
        graph.get(2).setNext(new GraphNode(0,20,null));
        graph.get(2).getNext()
                .add(new GraphNode(3,20,null))
                .add(new GraphNode(6,50,null));
        graph.get(3).setNext(new GraphNode(2,20,null));
        graph.get(3).getNext()
                .add(new GraphNode(8,20,null));
        graph.get(4).setNext(new GraphNode(1,20,null));
        graph.get(4).getNext()
                .add(new GraphNode(8,20,null));
        graph.get(5).setNext(new GraphNode(1,50,null));
        graph.get(5).getNext()
                .add(new GraphNode(6,30,null));
        graph.get(6).setNext(new GraphNode(0,50,null));
        graph.get(6).getNext()
                .add(new GraphNode(2,50,null))
                .add(new GraphNode(5,30,null));
        graph.get(7).setNext(new GraphNode(1,30,null));
        graph.get(8).setNext(new GraphNode(0,50,null));
        graph.get(8).getNext()
                .add(new GraphNode(3,20,null))
                .add(new GraphNode(4,20,null));

        int co = sc.nextInt();
        switch (co){
            case 1:
                Menu.Navigation();
                char key = ' ';
                Scanner scanner = new Scanner(System.in);
                key = scanner.next().charAt(0);//获取用户输入的第一个字符
                boolean loop = true;
                while (loop==true){
                    switch (key){
                        case 'A': //查询所有景点信息
                            for (Attraction value : graph) {
                                System.out.print(value.getName() + "\t");
                            }
                            System.out.println();
                            Menu.back();
                            break;
                        case 'B':
                            System.out.println("请输入地点的名称：");
                            String attractionName = scanner.next();

                            Attraction attractionDetail = graph.searchAttraction(attractionName);
                            if (attractionDetail != null){
                                System.out.println(attractionDetail);
                                break;
                            }
                            System.out.println("该地点不存在！");
                        case 'C'://查询两个地点最短距离
                            System.out.println("请输入出发地点的名称：");
                            String startAttraction = scanner.next();
                            if (!graph.containsAttraction(startAttraction)){
                                System.out.println("该地点不存在！");
                                break;
                            }
                            System.out.println("请输入到达地点的名称：");
                            String stopAttraction = scanner.next();
                            if (!graph.containsAttraction(stopAttraction)){
                                System.out.println("该地点不存在！");
                                break;
                            }
                            Map<Attraction,Integer> attractions = graph.shortestPath(startAttraction,stopAttraction);
                            if (attractions == null){
                                System.out.println("路径不存在！");
                                break;
                            }
                            System.out.println("\n最短路径为：");
                            attractions.forEach((id,value) -> System.out.println("到达 "+id.getName()+"，需"+value+"米-->"));
                            System.out.println();
                            Menu.back();
                            break;
                        case 0:     //退回主菜单
                            Menu.back();
                            break;
                        default:
                            Menu.back();
                            break;
                    }break;}
                break;
            case 2:     //显示简介
                Menu.SchoolProfile();
                System.out.printf("输入0返回到主菜单");
                int choice=sc.nextInt();
                if (choice==0){
                    Menu.back();
                }else
                    break;
            case 0:     //退出程序
                break;
            default:    //输入其他整数都返回到主菜单
                break;
        }
    }
}
