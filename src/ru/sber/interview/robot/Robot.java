package ru.sber.interview.robot;

public class Robot {
    private final Leg leftLeg = new Leg("Left");
    private final Leg rightLeg = new Leg("Right");

    public void start() {
        leftLeg.start();
        rightLeg.start();
    }

    public static void main(final String[] args) {
        try {
            Robot robot = new Robot();
            robot.start();

            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
