package ge.chalauri.examples.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListDemo {

    private static final int AMOUNT_OF_ELEMENTS = 50_000_000;
    private static final Random random = new Random();

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(AMOUNT_OF_ELEMENTS);

        long start = System.currentTimeMillis();
        initializeList(integers);
        long end = System.currentTimeMillis();
        System.out.println("Initialize took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        insertFirst(integers, -9999);
        end = System.currentTimeMillis();
        System.out.println("Insert first took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        removeFirstElement(integers);
        end = System.currentTimeMillis();
        System.out.println("Remove first took " + (end - start) + " Milliseconds");

    }


    private static void initializeList(List<Integer> integers) {
        for (int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
            integers.add(random.nextInt());
        }
    }

    private static void removeFirstElement(List<Integer> integers) {
        integers.remove(0);
    }

    private static void insertFirst(List<Integer> integers, Integer element) {
        integers.add(0, element);
    }
}
