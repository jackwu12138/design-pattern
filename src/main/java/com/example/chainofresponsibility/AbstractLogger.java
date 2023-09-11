package com.example.chainofresponsibility;

/**
 * @author jackwu
 */
public abstract class AbstractLogger {

    protected LogLevel level;

    protected AbstractLogger next;

    public void setNext(AbstractLogger next) {
        this.next = next;
    }

    public void logMessage(LogLevel level, String message) {
        System.out.printf("compare to: [%s] and [%s]\n", level.name(), this.level.name());
        if (this.level.getLevel() <= level.getLevel()) {
            write(message);
        }
        if (next != null) {
            next.logMessage(level, message);
        }
    }

    protected abstract void write(String msg);
}
