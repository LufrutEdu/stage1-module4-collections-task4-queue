package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;


public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

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
        return out;
    }
}
