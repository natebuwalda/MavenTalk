package com.demo.mavenTalk;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WorldTest {

    @Test
    public void shouldSayWorld() throws Exception {
        World worldClass = new World();
        assertEquals("World", worldClass.sayWorld());
    }
}
