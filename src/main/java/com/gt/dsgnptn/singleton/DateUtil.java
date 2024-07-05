package com.gt.dsgnptn.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable {

    private static volatile DateUtil instance; //volatile to let other threads know that the value of instance variable will change

    /*static {
        instance = new DateUtil();
    }*/

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        synchronized (DateUtil.class) { // synchronized block to stop parallel threads to create multiple instances
            if (instance == null) {
                instance = new DateUtil();

            }
        }
        return instance;
    }
}
