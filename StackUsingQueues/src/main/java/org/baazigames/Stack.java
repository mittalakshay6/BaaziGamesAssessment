package org.baazigames;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Stack<E> implements Collection<E> {

    private final Queue<E> mainQueue = new ConcurrentLinkedQueue<>();
    private final Queue<E> temporaryQueue = new ConcurrentLinkedQueue<>();

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return  The object at the top of this stack, null if empty.
     */
    public E pop() {
        return mainQueue.poll();
    }

    /**
     * Pushes an item onto the top of this stack.
     * @param   item   the item to be pushed onto this stack.
     * @return  the <code>item</code> argument.
     */
    public E push(E item) {
        temporaryQueue.offer(item);
        while (!mainQueue.isEmpty()) {
            temporaryQueue.add(mainQueue.poll());
        }
        while (!temporaryQueue.isEmpty()) {
            mainQueue.add(temporaryQueue.poll());
        }
        return item;
    }

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     *
     * @return  the object at the top of this stack, null if empty.
     */
    public E peek() {
        return mainQueue.peek();
    }

    @Override
    public int size() {
        return mainQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return mainQueue.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return mainQueue.iterator();
    }

    @Override
    public Object[] toArray() {
        return mainQueue.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return mainQueue.toArray(a);
    }

    @Override
    public boolean add(E e) {
        try {
            push(e);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return mainQueue.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return mainQueue.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (Objects.isNull(c) || c.size() == 0) {
            return false;
        }
        c.forEach(this::add);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return mainQueue.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return mainQueue.retainAll(c);
    }

    @Override
    public void clear() {
        mainQueue.clear();
    }
}
