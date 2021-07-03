package com.bjpowernode;

import redis.clients.jedis.Jedis;
//剑圣

public class App {
    public static void main(String[] args) {

        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.flushAll();
        jedis.set("age", "11");
        String age = jedis.get("age");
        System.out.println(age);
    }
}
