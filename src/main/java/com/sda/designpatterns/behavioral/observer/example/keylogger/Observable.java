package com.sda.designpatterns.behavioral.observer.example.keylogger;

public interface Observable {

    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers(String text);
}
