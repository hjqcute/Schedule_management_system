package log;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import course.Class;
public class User implements Serializable {
    private String username;
    private String password;
    private String id;

    public User() {
    }

    public User(String username, String password, String id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "User{username = " + username +
                ", password = " + password +
                ", id = " + id + "}";
    }

    public static void addClass(Class oneclass) {
        for(String id : oneclass.studentsId) {
            File userFile = new File("Schedule management system/users" + id);
            if(userFile.exists()) {
                String path = "Schedule management system/users" + id + "/" + "class/" + oneclass.getClassId();
                File file = new File(path);
                if(!file.exists()) {
                    file.mkdirs();
                }
            }
        }
    }
}
