package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;


public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        firstQueue = new ArrayDeque<>();
        firstQueue.add(1);
        firstQueue.add(5);
        firstQueue.add(7);
        firstQueue.add(6);
        secondQueue = new ArrayDeque<>();
        secondQueue.add(2);
        secondQueue.add(5);
        secondQueue.add(8);
        secondQueue.add(3);

        ArrayDeque<Integer> out = new ArrayDeque<>();
        out.add(firstQueue.remove());
        out.add(firstQueue.remove());

        out.add(secondQueue.remove());
        out.add(secondQueue.remove());

        while(!firstQueue.isEmpty() && !secondQueue.isEmpty()){


            firstQueue.add(out.remove());

            out.add(firstQueue.remove());
            out.add(firstQueue.remove());

            secondQueue.add(out.remove());

            out.add(secondQueue.remove());
            out.add(secondQueue.remove());

        }
        System.out.println(out);
        return out;
    }
}
