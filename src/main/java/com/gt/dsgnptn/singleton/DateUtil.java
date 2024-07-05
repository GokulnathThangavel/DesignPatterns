package com.gt.dsgnptn.singleton;

import java.io.Serializable;

public class DateUtil  implements Serializable {

    private static DateUtil instance;

    /*static {
        instance = new DateUtil();
    }*/

    private DateUtil() {
    }

    serializable(if (instance == null)) {
        public static DateUtil getInstance () {
            if (instance == null) {
                instance = new DateUtil();

            }
            return instance;
        }
    }
}
