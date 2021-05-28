package ru.sber.interview.singletion;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Map<Integer, String> map;

    private Singleton() {
        map = new HashMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
    }

    public synchronized String getValue(Integer key) {
        return map.get(key);
    }
}
