package org.example.homework.consumer;

import org.example.homework.product.Product;
import org.example.homework.product.ProductType;
import org.example.homework.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Reshar extends Consumer {
    @Autowired
    public Reshar(Storage storage) {
        super(storage);
    }

    @Override
    public void takeProducts() {
        List<Product> productList = storage.takeProducts(ProductType.BIKE, false);
        products.addAll(productList);
    }
}
