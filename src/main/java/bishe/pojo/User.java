package bishe.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int userid;
    private String username;
    private String userpwd;
    private int vipsign;
    private String money;

    public User(int userid, String username, String userpwd, int vipsign, String money) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.vipsign = vipsign;
        this.money = money;
    }

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", vipsign=" + vipsign +
                ", money='" + money + '\'' +
                '}';
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public int getVipsign() {
        return vipsign;
    }

    public void setVipsign(int vipsign) {
        this.vipsign = vipsign;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
