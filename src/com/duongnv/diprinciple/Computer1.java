package com.duongnv.diprinciple;

public class Computer1 {

    private MediumMonitor mediumMonitor;

    public void doSomething() {
        mediumMonitor = new MediumMonitor();
        mediumMonitor.turnOn();
    }

    public static void main(String[] args) {
        new Computer1().doSomething();
    }
}
