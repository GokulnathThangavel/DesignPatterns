package com.gt.dsgnptn.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable {

    private static volatile DateUtil instance; // = new DateUtil(); Eager Initialisation. Objects get created when application loads up.
    // Volatile keyword is used to make sure that the instance variable is not cached and multiple threads can see the updated value
    //volatile to let other threads know that the value of instance variable will change

    /*static {                         //Static Initialization
        instance = new DateUtil();     //Static or Eager Initialization would create objects irrespective of whether it is required or not
    }*/

    private DateUtil() {        //Private Constructor to prevent other classes from creating DateUtil instance as this should be only instance creation
    }

    public static DateUtil getInstance() {
        synchronized (DateUtil.class) {      //Synchronized block to make sure only one thread can create instance at a time
            if (instance == null) {
                instance = new DateUtil();
            }
        }
        return instance;
    }
}
