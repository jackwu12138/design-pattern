package com.example.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jackwu
 */
public class Originator {

    private String state;

    /**
     * 认识女孩后状态的变化
     */
    public void changeState() {
        setState("心情可能很不好");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存一个备份
     *
     * @return 备忘录
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备份
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
