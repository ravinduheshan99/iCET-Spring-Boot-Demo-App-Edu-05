package edu.icet.demo.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.entity.ProductEntity;
import edu.icet.demo.model.Product;
import edu.icet.demo.repository.ProductRepository;
import edu.icet.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public Product save(Product product) {
        ProductEntity entity = mapper.convertValue(product, ProductEntity.class);
        ProductEntity saveProduct = repository.save(entity);
        product.setId(saveProduct.getId());
        return product;
    }

    @Override
    public List<Product> retriveAll() {
        final Iterable<ProductEntity> allProducts = repository.findAll();
        List<Product> productList = new ArrayList<>();
        allProducts.forEach(entity->{
            productList.add(mapper.convertValue(entity, Product.class));
        });
        return productList;
    }
}
