package com.example.chainofresponsibility;

/**
 * @author jackwu
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(LogLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard File::Logger" + msg    );
    }
}
