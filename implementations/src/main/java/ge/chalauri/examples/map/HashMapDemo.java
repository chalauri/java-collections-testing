package ge.chalauri.examples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapDemo {

    private static final int AMOUNT_OF_ELEMENTS = 30_000_000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        long start = System.currentTimeMillis();
        initializeMap(map);
        long end = System.currentTimeMillis();
        System.out.println("Initialize took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        map.put(-99999, -99999);
        end = System.currentTimeMillis();
        System.out.println("Insert took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        map.remove(-99999);
        end = System.currentTimeMillis();
        System.out.println("Remove took " + (end - start) + " Milliseconds");
    }

    private static void initializeMap(Map<Integer, Integer> map) {
        for (int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
            map.put(random.nextInt(), random.nextInt());
        }
    }
}
