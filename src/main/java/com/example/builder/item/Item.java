package com.example.builder.item;

import com.example.builder.packing.Packing;

/**
 * @author jackwu
 */
public interface  Item {

    String name();

    Packing packing();

    Float price();
}
