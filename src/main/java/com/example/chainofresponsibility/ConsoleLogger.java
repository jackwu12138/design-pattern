package com.example.chainofresponsibility;

/**
 * @author jackwu
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(LogLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Console::Logger" + msg);
    }
}
