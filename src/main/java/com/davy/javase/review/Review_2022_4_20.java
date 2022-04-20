package com.davy.javase.review;

/**
 * @author Davy
 */
public class Review_2022_4_20 {
    private static int i;

    public static void main(String[] args) {
        System.out.println(A.name);
        System.out.println(i);
        for(int i = 0;i < args.length;i++){
            System.out.println("args["+i+"]"+args[i]);
        }
    }
}

class A{
    static String name = "davy";
}