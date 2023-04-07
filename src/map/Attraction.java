package map;
public class Attraction{
    private int no;
    private String name;
    private String position;
    private double longitude;
    private double latitude;
    private map.GraphNode next;

    public Attraction() {
    }

    public Attraction(int no, String name, String position, double longitude, double latitude, GraphNode next) {
        this.no = no;
        this.name = name;
        this.position = position;
        this.longitude = longitude;
        this.latitude = latitude;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * 设置
     * @param longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * 设置
     * @param latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
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

    public String toString() {
        return "Attraction{no = " + no + ", name = " + name + ", position = " + position +
                ", longitude = " + longitude + ", latitude = " + latitude +
                ", next = " + next + "}";
    }
}
