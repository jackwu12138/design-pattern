package com.example.prototype;

import lombok.Data;

/**
 * @author jackwu
 */
@Data
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
