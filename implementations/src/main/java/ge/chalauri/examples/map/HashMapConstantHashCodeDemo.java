package ge.chalauri.examples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapConstantHashCodeDemo {
    private static final int AMOUNT_OF_ELEMENTS = 100_000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        Map<Key, Object> map = new HashMap<>();

        long start = System.currentTimeMillis();
        initializeMap(map);
        long end = System.currentTimeMillis();
        System.out.println("Initialize took " + (end - start) + " Milliseconds");

        Key key = new Key();
        start = System.currentTimeMillis();
        map.put(key, -99999);
        end = System.currentTimeMillis();
        System.out.println("Insert took " + (end - start) + " Milliseconds");

        start = System.currentTimeMillis();
        map.remove(key);
        end = System.currentTimeMillis();
        System.out.println("Remove took " + (end - start) + " Milliseconds");
    }

    private static void initializeMap(Map<Key, Object> map) {
        for (int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
            map.put(new Key(), random.nextInt());
        }
    }
}
