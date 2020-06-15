package com.fhl.dubbo.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI(value = "robot")
public interface Robot {

    void sayHello();
}
