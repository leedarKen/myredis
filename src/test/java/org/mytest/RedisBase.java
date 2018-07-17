package org.mytest;

import org.junit.jupiter.api.BeforeAll;
import redis.clients.jedis.Jedis;

public class RedisBase {

    protected static Jedis jedis;

    @BeforeAll
    static void setUp() {
        jedis = new Jedis("192.168.33.106");
    }
}
