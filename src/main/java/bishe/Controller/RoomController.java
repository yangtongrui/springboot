package bishe.Controller;

import bishe.pojo.Room;
import bishe.service.RoomService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;
    //房间列表
    @RequestMapping("/roomlist")
    @ResponseBody
    public String getRoomList(){
        List<Room> roomList = roomService.getAllRoomList();
        /*for (Room room : roomList) {
            System.out.println(room);
        }*/
        return  JSON.toJSONString(roomList);
    }
    //查看
    @RequestMapping("/select")
    @ResponseBody
    public String selectRoomByid(int roomid){
        Room room = new Room();
        return  JSON.toJSONString(room);
    }
    
    //更改
    @RequestMapping("/update")
    @ResponseBody
    public String updateProduct(HttpServletRequest rep ) throws InvocationTargetException, IllegalAccessException {
        Room room = new Room();
        Map<String, String[]> parameterMap = rep.getParameterMap();
        BeanUtils.populate(room,parameterMap);
        roomService.updateRoom(room);
        String s = "{\"message\":\"成功\" , \"code\":\"101\"}";
        return JSON.toJSONString(s);
    }

    //删除
    @RequestMapping("/delete")
    @ResponseBody
    public String deleteProduct(HttpServletRequest rep ) {
        roomService.deleteRoomById(Integer.valueOf(rep.getParameter("roomid")));
        String s = "{\"message\":\"成功\" , \"code\":\"101\"}";
        return JSON.toJSONString(s);
    }
}
