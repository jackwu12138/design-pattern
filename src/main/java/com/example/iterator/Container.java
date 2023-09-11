package com.example.iterator;

/**
 * @author jackwu
 */
public interface Container<T> {

    Iterator<T> getIterator();
}
