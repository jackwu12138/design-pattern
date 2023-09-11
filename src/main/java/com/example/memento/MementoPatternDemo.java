package com.example.memento;

/**
 * @author jackwu
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        var originator = new Originator();
        var careTaker = new CareTaker();
        originator.setState("心情很好");
        System.out.println("start" + originator.getState());

        careTaker.setMemento (originator.createMemento());

        originator.changeState();
        System.out.println("=====after=====" + originator.getState());
        originator.restoreMemento(careTaker.getMemento());
        System.out.println("=====after after=====" + originator.getState());
    }
}
