package com.example.mediator;

/**
 * @author jackwu
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        var jack = new User("jack");
        var tom = new User("tom");

        jack.sendMsg("hello tom!");
        tom.sendMsg("hello jack");
    }
}
