package com.example.template;

/**
 * @author jackwu
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new CricketGame();
        game.play();

        System.out.println();

        game = new FootballGame();
        game.play();
    }
}
