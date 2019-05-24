package ge.chalauri.examples.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListDemo {

    private static final int AMOUNT_OF_ELEMENTS = 50_000_000;
    private static final Random random = new Random();

    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();
        initializeList(integers);
        long end = System.currentTimeMillis();
        System.out.println("Initialize took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        integers.addFirst(-9999);
        end = System.currentTimeMillis();
        System.out.println("Insert first took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        integers.removeFirst();
        end = System.currentTimeMillis();
        System.out.println("Remove first took " + (end - start) + " Milliseconds");

    }

    private static void initializeList(List<Integer> integers) {
        for (int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
            integers.add(random.nextInt());
        }
    }
}
