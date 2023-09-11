package com.example.observer;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jackwu
 */
public class Subject {

    private final List<Observer> observers = new LinkedList<>();

    @Getter
    private int state;

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
