package com.example.observer;

/**
 * @author jackwu
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        var subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        subject.setState(10);
        subject.setState(15);
    }
}
