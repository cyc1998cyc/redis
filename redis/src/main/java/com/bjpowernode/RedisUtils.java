package com.bjpowernode;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
    //创建链接池对象
    private static JedisPool pool = null;

    public static JedisPool open(String host,int port){
        if (pool == null){
            JedisPoolConfig config = new JedisPoolConfig();
            //默认最大的连接数
            config.setMaxTotal(10);

            //空闲连接数
            config.setMaxIdle(2);

            //默认没有密码
            config.setTestOnBorrow(true);

            pool = new JedisPool(config,host,port);
        }
        return pool;
    }

    public static void close(){
        if (pool != null){
            pool.close();
        }
    }

}
