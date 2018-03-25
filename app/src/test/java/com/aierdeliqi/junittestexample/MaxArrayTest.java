package com.aierdeliqi.junittestexample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Quin on 2018/3/24.
 * version 1.1
 */
public class MaxArrayTest {
    @Test
    public void searchMaxArray() throws Exception {
//        assertEquals(20,new MaxArray(0).searchMaxArray());
//        assertEquals(6,new MaxArray(new int[]{-4,1,2,3}).searchMaxArray());
//        assertEquals(10,new MaxArray(new int[]{1,2,3,4}).searchMaxArray());
//        assertEquals(0,new MaxArray(new int[]{-1,-2,-3,-4}).searchMaxArray());
        assertEquals(1,new MaxArray(new int[]{0,0,0,1}).searchMaxArray());
    }

}