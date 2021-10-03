package com.epam.task_2.main;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void unionArraysTest1() {
        int[] mas1 = {1, 2, 3, 4};
        int[] mas2 = {25, 25};
        int k = 2;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = {1, 2, 25, 25, 3, 4};
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest2() {
        int[] mas1 = {1, 2, 3, 4};
        int[] mas2 = {25, 25};
        int k = 4;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = {1, 2, 3, 4, 25, 25};
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest3() {
        int[] mas1 = {1, 2, 3, 4};
        int[] mas2 = {25, 25};
        int k = -2;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = null;
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest4() {
        int[] mas1 = {1, 2, 3, 4};
        int[] mas2 = {25, 25};
        int k = 0;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = null;
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest5() {
        int[] mas1 = {1, 2, 3, 4};
        int[] mas2 = {25, 25};
        int k = 100;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = null;
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest6() {
        int[] mas1 = {};
        int[] mas2 = {25, 25};
        int k = 2;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = null;
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest7() {
        int[] mas1 = {1, 2, 3, 4};
        int[] mas2 = {};
        int k = 2;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = null;
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest8() {
        int[] mas1 = null;
        int[] mas2 = {25, 25};
        int k = 2;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = null;
        Assert.assertArrayEquals(masResult, masTest);
    }

    @Test
    public void unionArraysTest9() {
        int[] mas1 = {1, 2, 3, 4};
        int[] mas2 = null;
        int k = 2;
        int[] masResult = Main.unionArrays(mas1, mas2, k);

        int[] masTest = null;
        Assert.assertArrayEquals(masResult, masTest);
    }
}