package com.duongnv.diprinciple;

public class Computer2 {

    private Monitor monitor;

    private void doSomething() {
        monitor = new SmallMonitor();
        monitor.turnOn();
    }

    public static void main(String[] args) {
        new Computer2().doSomething();
    }
}
