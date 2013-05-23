package com.demo.mavenTalk;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HelloTest {

    @Test
    public void shouldSayHello() throws Exception {
        Hello helloClass = new Hello();

        assertEquals("Hello", helloClass.sayHello());
    }
}
