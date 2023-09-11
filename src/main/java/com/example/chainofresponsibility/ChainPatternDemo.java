package com.example.chainofresponsibility;

/**
 * @author jackwu
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        AbstractLogger fileLogger = new FileLogger(LogLevel.INFO);
        AbstractLogger errorLogger = new ErrorLogger(LogLevel.ERROR);

        fileLogger.setNext(errorLogger);
        consoleLogger.setNext(fileLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug level information.");
        System.out.println("---------------------------------------------");

        loggerChain.logMessage(LogLevel.INFO, "This is an information.");
        System.out.println("---------------------------------------------");

        loggerChain.logMessage(LogLevel.ERROR, "This is an error information.");
        System.out.println("---------------------------------------------");
        System.out.println("INFO 123456789");
    }
}
