package com.zxl.controller;


import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WxTest {

    private static final String APPID = "wxe************33";
    private static final String SECRET = "18*********************47";
    private static final String wxurl = "https://api.weixin.qq.com/sns/jscode2session";

    //获取凭证校检接口
    @RequestMapping("code")
    public String login(String code) {
//        if (code != null && !"".equals(code)) {
            String httpUrl = wxurl + "?appid=" + APPID + "&secret=" + SECRET + "&js_code=" + code
                    + "&grant_type=authorization_code";
            RestTemplate restTemplate = new RestTemplate();
            //进行网络请求,访问url接口
            ResponseEntity<String> responseEntity = restTemplate.exchange(httpUrl, HttpMethod.GET, null, String.class);
            //根据返回值进行后续操作
            if (responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK) {
                String sessionData = responseEntity.getBody();
//                Gson gson = new Gson();
                //解析从微信服务器获得的openid和session_key;
//                WeChatSession weChatSession = gson.fromJson(sessionData,WeChatSession.class);
//                //获取用户的唯一标识
//                String openid = weChatSession.getOpenid();
//                //获取会话秘钥
//                String session_key = weChatSession.getSession_key();
                //下面就可以写自己的业务代码了
                //最后要返回一个自定义的登录态,用来做后续数据传输的验证
                return sessionData;
            }

            return null;

//        } else {
//            return null;
//        }

    }
    @RequestMapping("aa")
    public Object aa(){
        return "aa";
    }
}
