package com.ximo.redis.springbootdataredis.ops;

import com.ximo.redis.springbootdataredis.constant.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author 朱文赵
 * @date 2017/12/20 8:50
 * @description
 */
@Component
public class StringValueOps {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void redisOps() {
        String token = UUID.randomUUID().toString();
        stringRedisTemplate.opsForValue()
                .set(String.format(RedisConstant.TOKEN_PREFIX, token), null, 0, null);
    }



}
