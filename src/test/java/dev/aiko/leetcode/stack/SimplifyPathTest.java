package dev.aiko.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimplifyPathTest {
    @Test
    void test() {
        SimplifyPath app = new SimplifyPath();
        String result = app.simplifyPath("/home/");
        assertEquals("/home", result);
    }

    @Test
    void test2() {
        SimplifyPath app = new SimplifyPath();
        String result = app.simplifyPath("/home/user/Documents/../Pictures");
        assertEquals("/home/user/Pictures", result);
    }

    @Test
    void test3() {
        SimplifyPath app = new SimplifyPath();
        String result = app.simplifyPath("/../");
        assertEquals("/", result);
    }

}