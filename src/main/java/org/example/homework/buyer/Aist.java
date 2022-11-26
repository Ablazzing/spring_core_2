package org.example.homework.buyer;

import org.example.homework.product.Bike;
import org.example.homework.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aist extends Supplier {
    @Autowired
    public Aist(Storage storage) {
        super(storage);
    }

    @Override
    public void addProduct() {
        storage.addProduct(new Bike());
    }
}
