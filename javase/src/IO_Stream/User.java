package IO_Stream;

import java.io.Serializable;

public class User implements Serializable {
    private final static long serialVersionUID = 1L;
    private transient String username; //transient代表游离不参与序列化
    private int pwd;
    private int age;
    private String brand;

    public User() {
    }

    public User(String username, int pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
