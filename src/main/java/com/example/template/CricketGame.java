package com.example.template;

/**
 * @author jackwu
 */
public class CricketGame extends Game{

    @Override
    void init() {
        System.out.println("CRICKET::INIT");
    }

    @Override
    void start() {
        System.out.println("CRICKET::START");
    }

    @Override
    void end() {
        System.out.println("CRICKET::END");
    }
}
