package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recursion1Test {

//    @Test
//    void array6True() {
//        assertAll(() -> assertTrue(new Recursion().array6(new int[] {1, 6, 4},0)),
//                () -> assertTrue(new Recursion().array6(new int[] {6},0)),
//                () -> assertTrue(new Recursion().array6(new int[] {2,5,6},0)));
//    }
//    @Test
//    void array6False() {
//        assertAll(() -> assertFalse(new Recursion().array6(new int[] {1, 4},0)));
//    }

    @Test
    void array220True() {
        assertAll(()-> assertTrue(new Recursion1().array220(new int[]{1, 2, 20},0)),
                ()->assertTrue(new Recursion1().array220(new int[]{3, 30},0)));
    }
}