package com.gt.dsgnptn.singleton;

public class TestDateUtil implements Runnable {

    @Override
    public void run() {
        // Access the DateUtil instance
        DateUtil instance = DateUtil.getInstance();
        System.out.println(Thread.currentThread().getName() + " accessing instance: " + instance);
    }

    public static void main(String[] args) {

        DateUtil dateUtil = DateUtil.getInstance();
        DateUtil dateUtil1 = DateUtil.getInstance();
        System.out.println(dateUtil1 == dateUtil);

        Thread thread1 = new Thread(new TestDateUtil(), "Thread-1");  // Two threads trying to create DateUtil instance
        Thread thread2 = new Thread(new TestDateUtil(), "Thread-2");
        thread1.start();
        thread2.start();
    }
}
