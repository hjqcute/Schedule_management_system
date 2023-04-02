package course;

import java.io.Serializable;
import java.util.List;

public class Class implements Serializable {
    private String classId;
    private String className;
    private String classWeek;
    private int classBeginTime;
    private int classEndTime;
    private int Duration;
    private String classTeacher;
    private String classLocation;
    private String testTime;
    private String testLocation;
    private String classOnlinePlatform;
    private String classOnlineLink;
    public List<String> studentsId;

    public Class() {
    }

    public Class(String className, String classWeek, int classBeginTime, int classEndTime, int Duration,
                 String classTeacher, String classLocation, String testTime, String testLocation,
                 String classOnlinePlatform, String classOnlineLink, List<String> studentsId) {
        this.className = className;
        this.classWeek = classWeek;
        this.classBeginTime = classBeginTime;
        this.classEndTime = classEndTime;
        this.Duration = Duration;
        this.classTeacher = classTeacher;
        this.classLocation = classLocation;
        this.testTime = testTime;
        this.testLocation = testLocation;
        this.classOnlinePlatform = classOnlinePlatform;
        this.classOnlineLink = classOnlineLink;
        this.studentsId = studentsId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassWeek() { return classWeek; }

    public void setClassWeek(String classWeek) { this.classWeek = classWeek; }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassBeginTime() {
        return classBeginTime;
    }

    public void setClassBeginTime(int classBeginTime) {
        this.classBeginTime = classBeginTime;
    }

    public int getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(int classEndTime) {
        this.classEndTime = classEndTime;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public String getTestLocation() { return testLocation; }

    public void setTestLocation(String testLocation) {
        this.testLocation = testLocation;
    }

    public String getClassOnlinePlatform() {
        return classOnlinePlatform;
    }

    public void setClassOnlinePlatform(String classOnlinePlatform) {
        this.classOnlinePlatform = classOnlinePlatform;
    }

    public String getClassOnlineLink() {
        return classOnlineLink;
    }

    public void setClassOnlineLink(String classOnlineLink) {
        this.classOnlineLink = classOnlineLink;
    }

    public List<String> getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(List<String> studentsId) {
        this.studentsId = studentsId;
    }

    public String toString() {
        return "Class{classId = " + classId + ", className = " + className +
                ", classBeginTime = " + classBeginTime + ", classEndTime = " + classEndTime +
                ", Duration = " + Duration +
                ", classTeacher = " + classTeacher + ", classLocation = " + classLocation +
                ", testTime = " + testTime + ", testLocation = " + testLocation +
                ", classOnlinePlatform = " + classOnlinePlatform + ", classOnlineLink = " + classOnlineLink +
                ", studentsId = " + studentsId + "}";
    }
}
