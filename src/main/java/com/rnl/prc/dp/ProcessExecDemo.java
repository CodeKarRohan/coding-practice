package com.rnl.prc.dp;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class ProcessExecDemo {

    public static void doSomething() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("ROHAN1");

        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        unsafe.putAddress(0, 0);


//throw new Exception("soemthis");

        System.out.println("ROHAN2");
    }
    public static void main(String[] args) throws Exception {

        System.out.println("ROHAN1");

        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        unsafe.putAddress(0, 0);


//throw new Exception("soemthis");

       System.out.println("ROHAN2");
    }
}
