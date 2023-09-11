package com.example.chainofresponsibility;

/**
 * @author jackwu
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(LogLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Error::Logger" + msg);
    }
}
