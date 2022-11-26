package org.example.homework.buyer;

import org.example.homework.storage.Storage;

public abstract class Supplier {
    protected Storage storage;

    public Supplier(Storage storage) {
        this.storage = storage;
    }

    abstract void addProduct();
}
