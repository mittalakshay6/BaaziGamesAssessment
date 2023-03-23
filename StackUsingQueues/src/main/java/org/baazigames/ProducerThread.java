package org.baazigames;

import java.util.Random;

public class ProducerThread<T extends Producer> extends Thread{
    private final T producer;
    private final int maxTimeToWait;

    private final Random randomNumberGenerator = new Random();
    public ProducerThread(int maxTimeToWait, T producer) {
        this.maxTimeToWait = maxTimeToWait;
        this.producer = producer;
    }
    public void run() {
        while (true) {
            producer.produce();
            try {
                Thread.sleep(randomNumberGenerator.nextInt(maxTimeToWait) * 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
