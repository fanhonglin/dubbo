package com.fhl.dubbo.javassist.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;
import org.apache.dubbo.remoting.Constants;

@SPI
public interface User {

    // 最后会生成User$Adaptive类
    @Adaptive({Constants.SERVER_KEY, Constants.TRANSPORTER_KEY})
    String getUser(URL url, String age);
}
