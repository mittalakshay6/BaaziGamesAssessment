package org.baazigames;

import java.util.Random;

public class ConsumerThread<T extends Consumer> extends Thread{
    private final T consumer;
    private final int maxTimeToWait;
    private final Random randomNumberGenerator = new Random();
    public ConsumerThread(int maxTimeToWait, T consumer) {
        this.maxTimeToWait = maxTimeToWait;
        this.consumer = consumer;
    }
    public void run() {
        while (true) {
            consumer.consume();
            try {
                Thread.sleep(randomNumberGenerator.nextInt(maxTimeToWait) * 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
