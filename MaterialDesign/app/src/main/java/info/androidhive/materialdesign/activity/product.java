package info.androidhive.materialdesign.activity;

import android.media.Image;

/**
 * Created by Kaivalya on 01/04/2016.
 */
public class product {
    public product(String title, String userid,Integer price,Integer distance){
        this.title = title;
        this.userid = userid;
        this.price = price;
        this.distance=distance;
    }


    String title,userid;
    Image pic;

    public product(String yogurt, String aaa, double v) {
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Image getPic() {
        return pic;
    }

    public void setPic(Image pic) {
        this.pic = pic;
    }

    Integer price;

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    Integer distance;
}
