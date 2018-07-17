package org.mytest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyValueTest extends RedisBase{

    @Test
    void testConnected() {
        assertEquals("PONG", jedis.ping());
    }
}
