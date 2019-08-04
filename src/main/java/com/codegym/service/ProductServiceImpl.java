package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static ArrayList<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "Hao Hao", 3500, "Mi tom"));
        products.add(new Product(2, "Thang long cung", 10000, "Cigarette"));
        products.add(new Product(3, "Sting", 8000, "Drink"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id - 1);
    }

    @Override
    public void update(int id, Product product) {
        products.set(id - 1, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id - 1);
    }
}