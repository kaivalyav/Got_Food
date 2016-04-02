package info.androidhive.materialdesign.activity;

/**
 * Created by Kaivalya on 01/04/2016.
 */
public class user {
    String name,userid,password,email;
    public user (String name, String userid, String password, String email, Integer points, Integer items_sold){
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.points = points;
        this.items_sold = items_sold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getItems_sold() {
        return items_sold;
    }

    public void setItems_sold(Integer items_sold) {
        this.items_sold = items_sold;
    }

    Integer points,items_sold;
}
