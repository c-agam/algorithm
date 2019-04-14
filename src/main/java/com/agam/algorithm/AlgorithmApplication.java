package com.agam.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantReadWriteLock;


@SpringBootApplication
public class AlgorithmApplication {

    static final int SHARED_SHIFT   = 16;
    static final int SHARED_UNIT    = (1 << SHARED_SHIFT);
    static final int MAX_COUNT      = (1 << SHARED_SHIFT) - 1;
    static final int EXCLUSIVE_MASK = (1 << SHARED_SHIFT) - 1;

    /** Returns the number of shared holds represented in count  */
    static int sharedCount(int c)    { return c >>> SHARED_SHIFT; }
    /** Returns the number of exclusive holds represented in count  */
    static int exclusiveCount(int c) { return c & EXCLUSIVE_MASK; }


    static ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) throws Exception{
//        SpringApplication.run(AlgorithmApplication.class, args);
//        Semaphore semaphore = new Semaphore(1);
//        semaphore.acquire();
//        semaphore.acquire();
//
//        System.out.println(exclusiveCount(2));
//        System.out.println(1>>>16);

        reentrantReadWriteLock.writeLock().lock();

        reentrantReadWriteLock.readLock().lock();

        System.out.println("==========");
    }

}
