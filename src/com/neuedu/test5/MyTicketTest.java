package com.neuedu.test5;

/**
 * @author bin
 * @date 2020/2/13 0013 22:59
 */
public class MyTicketTest {
    public static void main(String[] args) {
        // 1
        /*Thread t1 = new MyTicket();
        Thread t2 = new MyTicket();
        t1.start();
        t2.start();*/
        // 2
        /*Runnable mt = new MyTicket();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();*/
        // 3
        MyTicket mt = new MyTicket();
        Thread t1 = new Thread(()->{
            mt.add();
        });
        Thread t2 = new Thread(()->{
            mt.del();
        });
        t1.start();
        t2.start();
    }
}
