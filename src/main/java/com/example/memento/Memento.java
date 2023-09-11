package com.example.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author jackwu
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
