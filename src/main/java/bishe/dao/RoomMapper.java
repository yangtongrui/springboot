package bishe.dao;

import bishe.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {
    List<Room> getAllRoomList();

    void updateRoom(Room room);

    void deleteRoomById(Integer roomid);
}
