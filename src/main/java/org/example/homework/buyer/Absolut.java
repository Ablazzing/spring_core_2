package org.example.homework.buyer;

import org.example.homework.product.Vodka;
import org.example.homework.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Absolut extends Supplier {
    @Autowired
    public Absolut(Storage storage) {
        super(storage);
    }

    @Override
    public void addProduct() {
        storage.addProduct(new Vodka());
    }
}
