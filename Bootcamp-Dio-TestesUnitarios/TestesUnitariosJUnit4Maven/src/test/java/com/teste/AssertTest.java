package com.teste;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    public void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("text","text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAsserNull(){
        assertNull(null);
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(760);
        assertSame(aNumber,aNumber);
    }



}
