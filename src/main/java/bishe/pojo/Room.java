package bishe.pojo;

import java.io.Serializable;

public class Room implements Serializable {
    private int roomid;
    private String roompic;
    private double roomsize;
    private String roomthings;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Room(){

    }

    public Room(int roomid, String roompic, double roomsize, String roomthings, String type) {
        this.roomid = roomid;
        this.roompic = roompic;
        this.roomsize = roomsize;
        this.roomthings = roomthings;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomid=" + roomid +
                ", roompic='" + roompic + '\'' +
                ", roomsize=" + roomsize +
                ", roomthings='" + roomthings + '\'' +
                '}';
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRoompic() {
        return roompic;
    }

    public void setRoompic(String roompic) {
        this.roompic = roompic;
    }

    public double getRoomsize() {
        return roomsize;
    }

    public void setRoomsize(double roomsize) {
        this.roomsize = roomsize;
    }

    public String getRoomthings() {
        return roomthings;
    }

    public void setRoomthings(String roomthings) {
        this.roomthings = roomthings;
    }
}
