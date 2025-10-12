package dev.aiko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {
    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {7, 1, 2, 3, 4, 5, 6};
        RotateArray app = new RotateArray();
        app.rotateV2(arr, 1);
        assertArrayEquals(expected, arr);
    }
}