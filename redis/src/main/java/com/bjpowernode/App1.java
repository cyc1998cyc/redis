package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class App1 {
    public static void main(String[] args) {
        JedisPool pool = null;
        pool = RedisUtils.open("127.0.0.1", 6379);
        Jedis jedis = pool.getResource();
        jedis.set("name", "tom");
        String name = jedis.get("name");
        System.out.println(name);

        pool.close();
    }
}
