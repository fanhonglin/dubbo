package org.apache.dubbo.container.spring;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.container.Container;

public class TestSpringContainer {

    public static void main(String[] args) {

        ExtensionLoader<Container> extensionLoader = ExtensionLoader.getExtensionLoader(Container.class);
        Container spring = extensionLoader.getExtension("spring");
    }
}
