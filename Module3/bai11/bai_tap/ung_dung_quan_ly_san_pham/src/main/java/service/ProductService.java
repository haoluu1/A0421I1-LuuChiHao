package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> display();

    void save(Product product);

    Product findByID(int id);

    void update(int id, Product product);

    void delete(int id);
}
