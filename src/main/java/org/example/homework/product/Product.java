package org.example.homework.product;

import lombok.ToString;

@ToString
public abstract class Product {
    private boolean isBroken;

    public abstract String getName();

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
