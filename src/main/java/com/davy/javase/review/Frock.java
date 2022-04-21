package com.davy.javase.review;

/**
 * @author Davy
 */
class TestFrock{
    public static void main(String[] args) {
        Frock.getNextNum();
        Frock.getNextNum();
        System.out.println(Frock.getCurrentNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.serialNumber);
        Frock frock2 = new Frock();
        System.out.println(frock2.serialNumber);
        Frock frock3 = new Frock();
        System.out.println(frock3.serialNumber);
    }
}


public class Frock {
    static private int currentNum = 100000;
    int serialNumber;

    public Frock() {
        getNextNum();
        serialNumber = currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getCurrentNum() {
        return currentNum;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}
