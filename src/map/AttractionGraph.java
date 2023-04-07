package map;

import java.util.*;
class AttractionGraph extends ArrayList<Attraction> {
    // 通过名称查询地点是否存在
    public boolean containsAttraction(String key){
        List<String> attractionNames = new ArrayList<>();
        for (Attraction attraction : this){
            attractionNames.add(attraction.getName());
        }
        return attractionNames.contains(key);
    }

    /**
     * 通过出发地点和目的地点查询最短路径 ,迪杰斯特拉（Dijkstra）算法
     * startAttraction 出发地点
     * stopAttraction 目的地点
     */
    public Map<Attraction,Integer> shortestPath(String startAttraction, String stopAttraction){
        //出发地的编号
        int startNo = 0;
        //目的地的编号
        int stopNo = 0;
        //通过出发地和目的地的名称查找他们各自的编号
        for (Attraction attraction : this) {
            if (attraction.getName().equals(startAttraction)) {
                startNo = attraction.getNo();
            }
            if (attraction.getName().equals(stopAttraction)) {
                stopNo = attraction.getNo();
            }
        }
        //辅助集合，存放到达i的最短路径的长度
        ArrayList<Integer> dist = new ArrayList<>();
        //辅助集合，存放到达i的最短路径的前驱节点
        ArrayList<Integer> path = new ArrayList<>();
        //辅助集合，标记已经找到最短路径的节点
        ArrayList<Integer> s = new ArrayList<>();
        //构造初始dis、path、s集合
        /**
         * 构造初始dis、path、s集合-start
         */
        //dist中元素默认值为无穷大，表示无法到达
        //path中元素默认值为-1，表示无法到达或者出发节点本身
        //s中元素默认值为0，表示还未找到最短路径
        for(Attraction attraction : this){
            dist.add(Integer.MAX_VALUE);
            path.add(-1);
            s.add(0);
        }
        //出发节点的dist为0，表示不需要行动就可到达
        dist.set(startNo, 0);
        //从出发节点到他自身不需要再去寻找最短路径，就是他自己，故直接设为1，表示已经找到
        s.set(startNo, 1);
        //辅助指针，用来遍历出发景点的可直接达到的相邻节点
        GraphNode temp = this.get(startNo).getNext();
        //遍历出发顶点的有向边
        while (temp != null) {
            //修改可到达的顶点的dist值
            dist.set(temp.getNo(), temp.getDistance());
            //修改可到达的顶点的path值，即前驱顶点
            path.set(temp.getNo(), startNo);
            //继续往后遍历
            temp = temp.getNext();
        }
        /**
         * 构造初始dis、path、s集合-stop
         * 最短路径的求解-start
         */
        //因为出发顶点本身不需要再求最短路径，故只需要遍历this.size()-1次
        for (int i = 0; i < this.size() - 1; i++) {
            int mix = Integer.MAX_VALUE;
            int mixIndex = startNo;
            //第一次内循环，找出最小的最短路径，并记录最小的最短路径对应的顶点编号和路径长度
            for (int j = 0; j < dist.size(); j++) {
                if (s.get(j) == 0 && dist.get(j) < mix){
                    mixIndex = j;
                    mix = dist.get(j);
                }
            }
            s.set(mixIndex,1);
            GraphNode temp2 = this.get(mixIndex).getNext();
            //对辅助集合dist和path进行修改，查找出新的最短路径集合
            while (temp2 != null) {
                if (s.get(temp2.getNo()) == 0 && mix + temp2.getDistance() < dist.get(temp2.getNo())){
                    dist.set(temp2.getNo(),mix + temp2.getDistance());
                    path.set(temp2.getNo(),mixIndex);
                }
                temp2 = temp2.getNext();
            }
        }
        /**
         * 最短路径的求解-stop
         * 通过对辅助数组的查找，将最短路径返回-start
         */
        Map<Attraction,Integer> map = new LinkedHashMap<>();
        AttractionGraph attractionGraph = new AttractionGraph();
        //查找路径，并返回
        map.put(this.get(startNo), 0);
        while (stopNo != startNo){
            if (path.get(stopNo) == -1){
                return null;
            }
            attractionGraph.add(this.get(stopNo));
            stopNo = path.get(stopNo);
        }
        //因为是倒序查找的，所以找完之后要将集合的顺序反转
        Collections.reverse(attractionGraph);
        attractionGraph.forEach(attraction -> map.put(attraction, dist.get(attraction.getNo())));
        /**
         * 通过对辅助数组的查找，将最短路径返回-stop
         */
        return map;
    }

    //通过顶点名称查找顶点的详细信息
    public Attraction searchAttraction(String key){
        for (Attraction attraction : this) {
            if (attraction.getName().equals(key)) {
                return attraction;
            }
        }
        return null;
    }
}

