package com.wzy.common.utils;

import cn.hutool.extra.mail.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 王灼宇
 * @Since 2023/9/18 15:33
 */
@Component
public class MailUtils {


    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private ThreadPoolExecutor executor;

    //标题
    private static String subject = "YukeSeko在线判题OJ系统";

    public void sendAuthCodeEmail(String email) {
        try {
            String code = randomCode();
            String content = "尊敬的用户:你好! 你的验证码为:  " + code + "  (有效期为5分钟)";
            // 异步多线程实现
            executor.execute(() -> {
                redisTemplate.opsForValue().set(email, code, 5 , TimeUnit.MINUTES);
                MailUtil.send(email, subject, content, false);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 随机生成6位数的验证码
     *
     * @return String code
     */
    public static String randomCode() {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
