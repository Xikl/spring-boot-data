package com.ximo.redis.springbootdataredis.util;

import java.util.Random;

/**
 * @author 朱文赵
 * @date 2017/12/21 13:12
 * @description 取值工具类
 */
public class KeyUtil {

    /**
     * 生成唯一的id 当前时间（毫秒 + 100000以内的随机数）
     * @return 唯一id
     */
    public static String generateUniqueKey() {
        Integer number = new Random().nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }



}
