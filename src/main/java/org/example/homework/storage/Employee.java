package org.example.homework.storage;

import org.example.homework.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Employee {
    private boolean brokeNextProduct;

    private void brokeProduct(Product product) {
        if (brokeNextProduct) {
            product.setBroken(true);
        }
        brokeNextProduct = !brokeNextProduct;
    }

    public void addProduct(Product product, Map<String, List<Product>> products) {
        brokeProduct(product);
        if (products.containsKey(product.getName())) {
            products.get(product.getName()).add(product);
        } else {
            ArrayList<Product> arrayList = new ArrayList<>();
            arrayList.add(product);
            products.put(product.getName(), arrayList);
        }
    }
}
