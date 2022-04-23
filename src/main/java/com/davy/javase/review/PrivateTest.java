package com.davy.javase.review;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Davy
 */
public class PrivateTest {
    private String name = "helloKitty";

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.davy.javase.review.PrivateTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        System.out.println(name.get(o));
        aClass.getDeclaredField("name").set(o, "hello");
        System.out.println(aClass.getDeclaredField("name").get(o));
        Method getName = aClass.getDeclaredMethod("getName");
        Object invoke = getName.invoke(o);
        System.out.println(invoke);
    }
}

class Hw2 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        String filePath = "/Users/davy/a";
        Method createNewFile = aClass.getDeclaredMethod("createNewFile");
        Object o = declaredConstructor.newInstance(filePath);
        createNewFile.invoke(o);
    }
}
