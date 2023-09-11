package com.example.chainofresponsibility;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author jackwu
 */
@Getter
@RequiredArgsConstructor
public enum LogLevel {
    DEBUG(0),

    INFO(1),

    WARN(2),

    ERROR(3),
    ;

    private final Integer level;
}
