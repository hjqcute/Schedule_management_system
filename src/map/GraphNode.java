package map;
//有向边对应的顶点编号和有向边的长度
public class GraphNode{
    private int no;
    private int distance;
    private GraphNode next;

    public GraphNode() {
    }

    public GraphNode(int no, int distance, GraphNode next) {
        this.no = no;
        this.distance = distance;
        this.next = next;
    }

    /**
     * 获取
     * @return no
     */
    public int getNo() {
        return no;
    }

    /**
     * 设置
     * @param no
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * 获取
     * @return distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * 设置
     * @param distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * 获取
     * @return next
     */
    public GraphNode getNext() {
        return next;
    }

    /**
     * 设置
     * @param next
     */
    public void setNext(GraphNode next) {
        this.next = next;
    }

    public GraphNode add(GraphNode graph) {
        GraphNode temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = graph;
        return graph;
    }

    public String toString() {
        return "GraphNode{" + "no=" + no + ", distance=" + distance + ", next=" + next + "}";
    }
}
