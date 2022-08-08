package com.duongnv.di;

import com.duongnv.diprinciple.Monitor;
import com.duongnv.diprinciple.SmallMonitor;

public class Computer4 {

    private Monitor monitor;

    public Computer4() {

    }

    public Computer4(Monitor monitor) {
        this.monitor =  monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void doSomething() {
        this.monitor.turnOn();
    }

    public static void main(String[] args) {
        Monitor monitor = new SmallMonitor();
        Computer4 computer4 = new Computer4(monitor);
        computer4.doSomething();
    }

}
