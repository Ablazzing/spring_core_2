package org.example.homework.storage;

import org.example.homework.product.Product;
import org.example.homework.product.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Storage {
    private Employee mishka;
    private Employee zelya;
    private Map<String, List<Product>> products = new HashMap<>();
    private boolean isMishkaAdd;

    @Autowired
    public Storage(@Qualifier("mishka") Employee mishka, @Qualifier("zelya") Employee zelya) {
        this.mishka = mishka;
        this.zelya = zelya;
    }

    public void addProduct(Product product) {
        if (isMishkaAdd) {
            mishka.addProduct(product, products);
        } else {
            zelya.addProduct(product, products);
        }
        isMishkaAdd = !isMishkaAdd;
    }

    public List<Product> takeProducts(ProductType productType, boolean isBroken) {
        if (!products.containsKey(productType.name())) {
            return new ArrayList<>();
        }

        List<Product> takenProducts = products.get(productType.name()).stream()
                .filter(e -> e.isBroken() == isBroken)
                .collect(Collectors.toList());

        List<Product> nonTakenProducts = products.get(productType.name()).stream()
                .filter(e -> e.isBroken() != isBroken)
                .collect(Collectors.toList());

        products.put(productType.name(), nonTakenProducts);
        return takenProducts;
    }
}
