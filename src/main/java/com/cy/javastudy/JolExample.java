package com.cy.javastudy;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author chenyao
 * @version 1.0
 * @Description 对象头打印
 * @date 2022/7/26 18:07
 */
public class JolExample {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        System.out.println("还没有进入到同步块");
        System.out.println("markword:" + ClassLayout.parseInstance(o).toPrintable());
        //默认JVM启动会有一个预热阶段，所以默认不会开启偏向锁
        Thread.sleep(5000);
        Object b = new Object();
        System.out.println("还没有进入到同步块");
        long id1 = Thread.currentThread().getId();
        System.out.println("当前线程1id："+id1);
        System.out.println("markword:" + ClassLayout.parseInstance(b).toPrintable());
        synchronized (o){
            long id = Thread.currentThread().getId();
            System.out.println("当前线程id："+id);
            System.out.println("进入到了同步块");
            System.out.println("markword:" + ClassLayout.parseInstance(o).toPrintable());
        }
    }

}
