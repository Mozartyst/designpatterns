package com.sda.designpatterns.behavioral.observer.example.randomNumerGenerator;

import java.util.Random;

public class Datasource {
    public static void generate() {


        RandomGeneratorObservable randomGeneratorObservable = new RandomGeneratorObservable();

        randomGeneratorObservable.registerObserver(new ConsoleObserver());


        //sposób na tworznie liczb w osobnym wątku
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(new Random().nextInt() % 1000 + 1000);
                    int number = new Random().nextInt();
                    randomGeneratorObservable.notifyObservers(number);
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        Datasource.generate();
    }
}
