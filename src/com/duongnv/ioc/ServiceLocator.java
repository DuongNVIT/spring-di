package com.duongnv.ioc;

import com.duongnv.diprinciple.LargeMonitor;
import com.duongnv.diprinciple.Monitor;
import com.duongnv.diprinciple.SmallMonitor;

public class ServiceLocator {

    public static Monitor getMonitor(Class monitorType) {
        if(monitorType.isAssignableFrom(SmallMonitor.class)) {
            return new SmallMonitor();
        } else if(monitorType.isAssignableFrom(LargeMonitor.class)) {
            return new LargeMonitor();
        }
        return null;
    }

}
