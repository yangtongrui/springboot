package bishe.service;

import bishe.pojo.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;


@Service("TokenService")
public class TokenService {
    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(String.valueOf(user.getUserid()))// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getUserpwd()));// 以 password 作为 token 的密钥
        return token;
    }
}
