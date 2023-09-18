package com.wzy.oj.utils;

import cn.hutool.extra.mail.MailUtil;

import java.util.Random;

/**
 * @author 王灼宇
 * @Since 2023/9/18 15:33
 */
public class MailUtils {

    //标题
    private static String subject="YukeSeko在线判断系统-验证码";

    public static void sendAuthCodeEmail(String email) {
        try {
            String code = randomCode();
            String content = "尊敬的用户:你好! 你的验证码为:  "+code+"  (有效期为5分钟)";
            //todo 改为异步多线程实现并且 需要存入redis中去
            MailUtil.send(email,subject,content,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 随机生成6位数的验证码
     * @return String code
     */
    public static String randomCode(){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
