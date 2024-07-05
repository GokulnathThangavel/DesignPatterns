package com.gt.dsgnptn.singleton;

public class TestDateUtil {

    public static void main(String[] args) {
        DateUtil dateUtil = DateUtil.getInstance();
        DateUtil dateUtil1 = DateUtil.getInstance();
        System.out.println(dateUtil1 == dateUtil);

    }
}
