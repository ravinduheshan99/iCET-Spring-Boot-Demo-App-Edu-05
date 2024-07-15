package edu.icet.demo.service;

import edu.icet.demo.model.Product;
import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public List<Product> retriveAll();
}
