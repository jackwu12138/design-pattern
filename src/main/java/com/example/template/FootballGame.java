package com.example.template;

/**
 * @author jackwu
 */
public class FootballGame extends Game {

    @Override
    void init() {
        System.out.println("FOOTBALL::INIT");
    }

    @Override
    void start() {
        System.out.println("FOOTBALL::START");
    }

    @Override
    void end() {
        System.out.println("FOOTBALL::END");
    }
}
