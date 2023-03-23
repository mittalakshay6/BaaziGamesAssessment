package org.baazigames;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stack<Integer> sink = new Stack<>();
        ProducerThread<IntegerProducer> producerThread = new ProducerThread<>(
                5,
                new IntegerProducer(sink, 50)
        );
        ConsumerThread<IntegerConsumer> consumerThread = new ConsumerThread<>(
                5,
                new IntegerConsumer(sink)
        );
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}
