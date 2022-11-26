package org.example.homework.product;

public class Bike extends Product {
    @Override
    public String getName() {
        return ProductType.BIKE.name();
    }
}
