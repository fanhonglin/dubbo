package com.fhl.dubbo.spi;

import org.apache.dubbo.common.compiler.support.AdaptiveCompiler;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestDubboSPI {

    public static void main(String[] args) {


        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);

        String defaultExtensionName = extensionLoader.getDefaultExtensionName();

        extensionLoader.getAdaptiveExtension();


        Robot bumblebee = extensionLoader.getExtension("bumblebee");

        bumblebee.sayHello();
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

        // adaptive
        extensionLoader.getAdaptiveExtension();


    }
}
