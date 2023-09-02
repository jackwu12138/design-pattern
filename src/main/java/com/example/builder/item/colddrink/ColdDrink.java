package com.example.builder.item.colddrink;

import com.example.builder.item.Item;
import com.example.builder.packing.Bottle;
import com.example.builder.packing.Packing;

/**
 * @author jackwu
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Float price();
}
