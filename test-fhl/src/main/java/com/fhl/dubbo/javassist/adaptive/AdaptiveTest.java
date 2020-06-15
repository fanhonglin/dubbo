package com.fhl.dubbo.javassist.adaptive;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class AdaptiveTest {

    public static void main(String[] args) {

//        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(User.class);
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(User.class);
        Object adaptiveExtension = extensionLoader.getAdaptiveExtension();

    }
}
