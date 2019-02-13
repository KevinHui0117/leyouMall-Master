package com.leyou.redis;

import com.leyou.cart.LyCartApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: 98050
 * @Time: 2018-10-25 22:58
 * @Feature:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LyCartApplication.class)
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test(){
        BoundHashOperations<String,Object,Object> hashOperations = this.stringRedisTemplate.boundHashOps("test");
        hashOperations.delete("3");
        System.out.println("获取设置的绑定key值:" + hashOperations.getKey());
    }
}
