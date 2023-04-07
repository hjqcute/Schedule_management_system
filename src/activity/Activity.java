package activity;

public class Activity {
    private String activityId;
    private String activityName;
    private String activityPerson;
    private int weekBegin;
    private int weekEnd;
    private int weekData;
    private int beginTime;
    private int endTime;
    private int duration;
    private int activityType;
    private int locationId;
    private String activityLoc;
    private String status;
    private String description;

    public Activity() {
    }

    public Activity(String activityId, String activityName, String activityPerson, int weekBegin, int weekEnd, int weekData, int beginTime, int endTime, int duration, int activityType, int locationId, String activityLoc, String status, String description) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.activityPerson = activityPerson;
        this.weekBegin = weekBegin;
        this.weekEnd = weekEnd;
        this.weekData = weekData;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.duration = duration;
        this.activityType = activityType;
        this.locationId = locationId;
        this.activityLoc = activityLoc;
        this.status = status;
        this.description = description;
    }

    /**
     * 获取
     * @return activityId
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * 设置
     * @param activityId
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取
     * @return activityName
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 设置
     * @param activityName
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * 获取
     * @return activityPerson
     */
    public String getActivityPerson() {
        return activityPerson;
    }

    /**
     * 设置
     * @param activityPerson
     */
    public void setActivityPerson(String activityPerson) {
        this.activityPerson = activityPerson;
    }

    /**
     * 获取
     * @return weekBegin
     */
    public int getWeekBegin() {
        return weekBegin;
    }

    /**
     * 设置
     * @param weekBegin
     */
    public void setWeekBegin(int weekBegin) {
        this.weekBegin = weekBegin;
    }

    /**
     * 获取
     * @return weekEnd
     */
    public int getWeekEnd() {
        return weekEnd;
    }

    /**
     * 设置
     * @param weekEnd
     */
    public void setWeekEnd(int weekEnd) {
        this.weekEnd = weekEnd;
    }

    /**
     * 获取
     * @return weekData
     */
    public int getWeekData() {
        return weekData;
    }

    /**
     * 设置
     * @param weekData
     */
    public void setWeekData(int weekData) {
        this.weekData = weekData;
    }

    /**
     * 获取
     * @return beginTime
     */
    public int getBeginTime() {
        return beginTime;
    }

    /**
     * 设置
     * @param beginTime
     */
    public void setBeginTime(int beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取
     * @return endTime
     */
    public int getEndTime() {
        return endTime;
    }

    /**
     * 设置
     * @param endTime
     */
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取
     * @return duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * 设置
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * 获取
     * @return activityType
     */
    public int getActivityType() {
        return activityType;
    }

    /**
     * 设置
     * @param activityType
     */
    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    /**
     * 获取
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * 设置
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    /**
     * 获取
     * @return activityLoc
     */
    public String getActivityLoc() {
        return activityLoc;
    }

    /**
     * 设置
     * @param activityLoc
     */
    public void setActivityLoc(String activityLoc) {
        this.activityLoc = activityLoc;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Activity{activityId = " + activityId + ", activityName = " + activityName +
                ", activityPerson = " + activityPerson +
                ", weekBegin = " + weekBegin + ", weekEnd = " + weekEnd + ", weekData = " + weekData +
                ", beginTime = " + beginTime + ", endTime = " + endTime + ", duration = " + duration +
                ", activityType = " + activityType +
                ", locationId = " + locationId + ", activityLoc = " + activityLoc +
                ", status = " + status + ", description = " + description + "}";
    }
}
