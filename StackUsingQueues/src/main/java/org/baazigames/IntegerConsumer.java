package org.baazigames;

import java.util.Objects;
import java.util.Stack;

public class IntegerConsumer implements Consumer{
    private final Stack<Integer> sink;

    public IntegerConsumer(Stack<Integer> sink) {
        this.sink = sink;
    }
    @Override
    public void consume() {
        Integer consumedInteger = sink.pop();
        if (Objects.isNull(consumedInteger)) {
            System.out.println("Nothing to consume...");
        } else {
            System.out.println("Consumer consumed: " + consumedInteger);
        }
    }
}
