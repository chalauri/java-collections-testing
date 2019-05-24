package ge.chalauri.examples.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
    private static final int AMOUNT_OF_ELEMENTS = 50_000_000;
    private static final Random random = new Random();

    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();

        long start = System.currentTimeMillis();
        initializeSet(integers);
        long end = System.currentTimeMillis();
        System.out.println("Initialize took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        insert(integers, -9999);
        end = System.currentTimeMillis();
        System.out.println("Insert took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        remove(integers, -9999);
        end = System.currentTimeMillis();
        System.out.println("Remove took " + (end - start) + " Milliseconds");

    }


    private static void initializeSet(Set<Integer> integers) {
        for (int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
            integers.add(random.nextInt());
        }
    }

    private static void remove(Set<Integer> integers, Integer element) {
        integers.remove(0);
    }

    private static void insert(Set<Integer> integers, Integer element) {
        integers.add(element);
    }
}
