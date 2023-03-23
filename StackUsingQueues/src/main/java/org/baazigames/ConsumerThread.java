package org.baazigames;

public class ConsumerThread<T extends Consumer> extends Thread{
    private final long timeIntervalInSec;
    private final T consumer;
    public ConsumerThread(int timeIntervalInSec, T consumer) {
        this.timeIntervalInSec = timeIntervalInSec;
        this.consumer = consumer;
    }
    public void run() {
        while (true) {
            consumer.consume();
            try {
                Thread.sleep(timeIntervalInSec * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
