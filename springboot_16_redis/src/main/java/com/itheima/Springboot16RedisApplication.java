package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@SpringBootApplication
public class Springboot16RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot16RedisApplication.class, args);
        Object obj = null;
        String s = "abc=bdc=111";
        String[] split = s.split("=");
        String replace = "111"; //目标key
        String targetValue = "222"; //目标value
        String replace1 = "";
        for (int i = 0; i < split.length; i++) {
            if (split[i].endsWith(replace) || split[i].equals(replace)) {
                //判断下一个元素是否存在
                //可以看下是可以通过那个分割
//                split[i] = targetValue;
                s = s.replace(split[i], targetValue);
            }
            //替换

        }
        //重新将string[]转换成string
        System.out.println(replace1);
    }

    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        JedisPool jedisPool = new JedisPool();
        Jedis resource = jedisPool.getResource();
    }



}
