package com.aierdeliqi.junittestexample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/3/19.
 */
public class Binary_chopTest {
    @Test
    public void binary_chop() throws Exception {
        //assertEquals(5,new Binary_chop().binary_chop());
        assertEquals(-1,new Binary_chop(new int []{33,37,56,90,98,126,255,256,333,569},57).binary_chop());
    }
}