package com.example.builder.item.burger;

import com.example.builder.item.Item;
import com.example.builder.packing.Packing;
import com.example.builder.packing.Wrapper;

/**
 * @author jackwu
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract Float price();
}
