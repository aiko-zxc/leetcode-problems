package dev.aiko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void test() {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int[] expected = {1,2,2,3,5,6};
        MergeSortedArray app = new MergeSortedArray();

        app.merge(arr1, 3, arr2, 3);

        assertArrayEquals(expected, arr1);
    }

    @Test
    public void testEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        MergeSortedArray app = new MergeSortedArray();

        app.merge(arr1, 0, arr2, 0);

        assertArrayEquals(expected, arr1);
    }
}