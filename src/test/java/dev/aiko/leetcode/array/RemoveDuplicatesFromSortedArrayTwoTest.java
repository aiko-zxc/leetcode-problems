package dev.aiko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTwoTest {

    @Test
    public void test() {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        int[] expected = {0,0,1,1,2,3,3};
        RemoveDuplicatesFromSortedArrayTwo app = new RemoveDuplicatesFromSortedArrayTwo();

        int actual = app.removeDuplicates(arr);

        assertEquals(expected.length, actual);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void test2() {
        int[] arr = {1,1,2,2};
        int[] expected = {1,1,2,2};
        RemoveDuplicatesFromSortedArrayTwo app = new RemoveDuplicatesFromSortedArrayTwo();

        int actual = app.removeDuplicates(arr);

        assertEquals(expected.length, actual);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void test3() {
        int[] arr = {1,1,1,2,3};
        int[] expected = {1,1,2,3};
        RemoveDuplicatesFromSortedArrayTwo app = new RemoveDuplicatesFromSortedArrayTwo();

        int actual = app.removeDuplicates(arr);

        assertEquals(expected.length, actual);
        assertArrayEquals(expected, arr);
    }
}