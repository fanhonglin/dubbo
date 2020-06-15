package com.fhl.dubbo.spi;

import java.util.ServiceLoader;

public class TestJDKSPI {

    public static void main(String[] args) {
        ServiceLoader<Robot> load = ServiceLoader.load(Robot.class);
        load.forEach(Robot::sayHello);
    }
}
