package org.mytest;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisConnection {
    public static void main(String[] args) {
        //连接本地的jedis服务器
        Jedis jedis=new Jedis("192.168.33.106");

        //新建一个string类型的数组,用于存当时存入redis的map的key值
        String[] arr=new String[4];
        arr[0]="name";
        arr[1]="age";
        arr[2]="sex";
        arr[3]="height";
        //利用jedis的hmget方法,从数据库中依次取出对应的map的key值
        List<String> list = jedis.hmget("people",arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("存入键值对为:"+arr[i]+"--"+list.get(i));
        }

    }
}
