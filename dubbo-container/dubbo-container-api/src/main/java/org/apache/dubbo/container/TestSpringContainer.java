package org.apache.dubbo.container;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestSpringContainer {

    public static void main(String[] args) {

        ExtensionLoader<Container> extensionLoader = ExtensionLoader.getExtensionLoader(Container.class);
        Container spring = extensionLoader.getExtension("spring");
    }
}
