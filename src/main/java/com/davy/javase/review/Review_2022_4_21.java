package com.davy.javase.review;

/**
 * @author Davy
 */
public class Review_2022_4_21 {
    public static void main(String[] args) {
        new Cellphone().alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("🐷起床了");
            }
        });
    }
}

interface Bell{
    void ring();
}

class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}