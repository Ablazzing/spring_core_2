package org.example.homework.consumer;

import org.example.homework.product.Product;
import org.example.homework.product.ProductType;
import org.example.homework.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Petrovich extends Consumer {
    @Autowired
    public Petrovich(Storage storage) {
        super(storage);
    }

    @Override
    public void takeProducts() {
        List<Product> productList = storage.takeProducts(ProductType.VODKA, true);
        products.addAll(productList);
    }
}
