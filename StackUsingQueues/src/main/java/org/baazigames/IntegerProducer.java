package org.baazigames;

import java.util.Random;

public class IntegerProducer implements Producer {
    private final Stack<Integer> sink;
    private final int bound;
    private final Random randomNumberGenerator = new Random();

    public IntegerProducer(Stack<Integer> sink, int bound) {
        this.sink = sink;
        this.bound = bound;
    }
    @Override
    public void produce() {
        Integer producedInteger = randomNumberGenerator.nextInt(bound);
        sink.push(producedInteger);
        System.out.println("Producer produced: " + producedInteger);
    }
}
