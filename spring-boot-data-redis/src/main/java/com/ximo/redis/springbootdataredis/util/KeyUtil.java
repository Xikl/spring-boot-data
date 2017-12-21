package com.ximo.redis.springbootdataredis.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @author 朱文赵
 * @date 2017/12/21 13:12
 * @description 取值工具类
 */
public class KeyUtil {

    /** 格式化时间的模式*/
    private static final String TIME_PATTERN = "yyyyMMddHHmmssSSS";

    /**
     * 生成唯一的id 当前时间（毫秒 + 100000以内的随机数）
     * @return 唯一id
     */
    public static String generateUniqueKey() {
        Integer number = new Random().nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

    /**
     * 获得当前时间比如 201712211505889
     * @return string 类型的时间
     */
    public static String generateNowTime() {
        return DateTimeFormatter.ofPattern(TIME_PATTERN).format(LocalDateTime.now());
    }


}
