package bishe.service;

import bishe.dao.RoomMapper;
import bishe.pojo.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;
    @Override
    public List<Room> getAllRoomList() {
        return roomMapper.getAllRoomList();
    }

    @Override
    public void updateRoom(Room room) {
         roomMapper.updateRoom(room);
    }

    @Override
    public void deleteRoomById(Integer roomid) {
        roomMapper.deleteRoomById(roomid);
    }
}
