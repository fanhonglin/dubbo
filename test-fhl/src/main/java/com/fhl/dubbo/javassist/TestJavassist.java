package com.fhl.dubbo.javassist;

import javassist.*;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestJavassist {

    public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {

        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.makeClass("com.fhl.dubbo.spi.Bumblebee");

        CtField ctField = new CtField(pool.getCtClass("java.lang.String"), "name", ctClass);
        ctField.setModifiers(Modifier.PRIVATE);
        ctClass.addField(ctField);


        byte[] bytes = ctClass.toBytecode();

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\git\\dubbo\\test-fhl\\src\\main\\java\\com\\fhl\\dubbo\\javassist\\Bumblebee.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
