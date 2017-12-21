package com.ximo.redis.springbootdataredis.ops;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 朱文赵
 * @date 2017/12/21 13:24
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StringValueOpsTest {

    @Autowired
    private StringValueOps stringValueOps;

    @Test
    public void redisOps() {
        stringValueOps.redisOps();
    }

    @Test
    public void test() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String time = formatter.format(now);
        System.out.println(time);
    }
}