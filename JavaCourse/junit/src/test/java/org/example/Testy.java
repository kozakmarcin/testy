package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Testy {
    @Test
    void commonTwo() {
        assertAll(() ->  assertEquals(2,new AP1().commonTwo(new String[]{"a", "c", "x"},new String[]{"b", "c", "d", "x"})),
        () -> assertEquals(3,new AP1().commonTwo(new String[]{"a", "c", "x"},new String[]{"a", "b", "c", "x", "z"})),
        () -> assertEquals(3,new AP1().commonTwo(new String[]{"a", "a", "b", "b", "c"},new String[]{"a", "b", "b", "b", "c"})));
    }


//    @Test
//    void mergeTwo() {
//        assertAll(() -> assertArrayEquals(new String[]{"a", "c", "f"},new Testy().mergeTwo(new String[]{"a", "c", "z"},new String[]{"c", "f", "z"},3)));
//    }


//    @Test
//    void xyzMiddle() {
//        assertAll(() -> assertTrue(new Testy().xyzMiddle("AxyzBBB")));
//
//
//    }

//      @Test
//    void mixString() {
//        assertAll(() -> assertEquals("axbycz",new Testy().mixString("abc", "xyz")),
//          () -> assertEquals("HTihere",new Testy().mixString("Hi", "There")));
//    }


//    @Test
//    void countCode() {
//        assertAll(() -> assertEquals(2,new Testy().countCode("cozexxcope")));
//    }


//
//    @Test
//    void doubleChar() {
//        assertAll(() -> assertEquals("TThhee",new Testy().doubleChar("The")));
//    }
//    @Test
//    void doubleChar1() {
//        assertAll(() -> assertEquals("AAAAbbbb",new Testy().doubleChar("AAbb")),
//        () -> assertEquals("HHii--TThheerree",new Testy().doubleChar("Hi-There")));
//    }
}