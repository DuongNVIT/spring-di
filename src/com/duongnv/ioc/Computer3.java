package com.duongnv.ioc;

import com.duongnv.diprinciple.LargeMonitor;
import com.duongnv.diprinciple.Monitor;

public class Computer3 {

    private Monitor monitor;

    private void doSomething() {
        this.monitor = ServiceLocator.getMonitor(LargeMonitor.class);
        this.monitor.turnOn();
    }

    public static void main(String[] args) {
        new Computer3().doSomething();
    }
}
