package bishe.Controller;

import bishe.pojo.User;
import bishe.service.TokenService;
import bishe.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;
    //登录
    @RequestMapping("/login")
    @ResponseBody
    public Object login(@RequestBody (required = false)User user) {
        JSONObject jsonObject = new JSONObject();
        User userForBase = userService.login(user.getUsername(), user.getUserpwd());
        System.out.println(userForBase.toString());
        if (userForBase == null) {
            jsonObject.put("message", "登录失败,用户不存在");
            return jsonObject;
        } else {
            if (!userForBase.getUserpwd().equals(user.getUserpwd())) {
                jsonObject.put("message", "登录失败,密码错误");
                return jsonObject;
            } else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                System.out.println("jsonObject = " + jsonObject.toString());
                return jsonObject;
            }
        }
    }
}
