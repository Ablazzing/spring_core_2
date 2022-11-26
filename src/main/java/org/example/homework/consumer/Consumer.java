package org.example.homework.consumer;

import lombok.ToString;
import org.example.homework.product.Product;
import org.example.homework.storage.Storage;

import java.util.ArrayList;
import java.util.List;
@ToString(exclude = {"storage"})
public abstract class Consumer {
    protected List<Product> products = new ArrayList<>();
    protected Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    public abstract void takeProducts();
}
