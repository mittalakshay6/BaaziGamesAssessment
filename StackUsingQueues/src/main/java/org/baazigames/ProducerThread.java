package org.baazigames;

public class ProducerThread<T extends Producer> extends Thread{
    private final long timeIntervalInSec;
    private final T producer;
    public ProducerThread(int timeIntervalInSec, T producer) {
        this.timeIntervalInSec = timeIntervalInSec;
        this.producer = producer;
    }
    public void run() {
        while (true) {
            producer.produce();
            try {
                Thread.sleep(timeIntervalInSec * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
