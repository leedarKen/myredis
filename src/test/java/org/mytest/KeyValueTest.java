package org.mytest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyValueTest extends RedisBase{

    @Test
    void testConnected() {
        JedisPoolUtil.getJedisPoolInstall();
        assertEquals("testEE", System.getProperty("ee"));
        assertEquals("PONG", jedis.ping());
    }
}
