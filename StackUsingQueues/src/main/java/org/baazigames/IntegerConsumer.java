package org.baazigames;

import java.util.ArrayList;
import java.util.List;

public class IntegerConsumer implements Consumer{
    private final Stack<Integer> sink;

    public IntegerConsumer(Stack<Integer> sink) {
        this.sink = sink;
    }
    @Override
    public void consume() {
        if (sink.isEmpty()) {
            System.out.println("Nothing to consume...");
        } else {
            List<Integer> consumedIntegers = new ArrayList<>();
            while(!sink.isEmpty()) {
                consumedIntegers.add(sink.pop());
            }
            System.out.println("Consumer consumed: " + consumedIntegers);
        }
    }
}
