package bishe.service;

import bishe.pojo.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRoomList();

    void updateRoom(Room room);

    void deleteRoomById(Integer roomid);
}
