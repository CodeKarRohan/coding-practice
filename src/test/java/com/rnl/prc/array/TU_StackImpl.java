package com.rnl.prc.array;

import com.rnl.prc.ds.stack.StackImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TU_StackImpl {

    private StackImpl stack1;

    @Before
    public void setUp(){
        stack1 = new StackImpl();
    }


    @Test
    public  void testStackImpl() {
        Assert.assertTrue(stack1.isEmpty());
        stack1.push(10);
        Assert.assertFalse(stack1.isEmpty());
        Assert.assertEquals((Integer) 10, stack1.peek());
        Assert.assertFalse(stack1.isEmpty());
        Assert.assertEquals((Integer) 10, stack1.pop());
        Assert.assertTrue(stack1.isEmpty());

    }

}
