package com.aierdeliqi.junittestexample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/3/24.
 */
public class MaxArrayTest {
    @Test
    public void searchMaxArray() throws Exception {
        assertEquals(20,new MaxArray().searchMaxArray());
    }

}