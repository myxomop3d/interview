package ru.sber.interview.robot;

import static java.util.Objects.requireNonNull;

public class Leg extends Thread {
    private final String name;

    public Leg(String name) {
        this.name = requireNonNull(name);
        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name);
        }
    }
}
