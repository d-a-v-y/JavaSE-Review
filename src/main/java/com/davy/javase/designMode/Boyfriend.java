package com.davy.javase.designMode;

/**
 * @author Davy
 * 饿汉模式
 */
public class Boyfriend {
    public static void main(String[] args) {
        System.out.println(Bf.getInstance());
    }
}

class Bf{

    private String name;

    private static Bf bf = new Bf("WS");

    private Bf(String name) {
        this.name = name;
    }

    public static Bf getInstance(){
        return bf;
    }
}