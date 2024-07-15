package edu.icet.demo.controller;

import edu.icet.demo.model.Product;
import edu.icet.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    //to avoid re-initialization
    final ProductService service;

    ProductController(ProductService service){
        this.service=service;
    }

    @PostMapping()
    public Product save(@RequestBody Product product){
       return service.save(product);
    }

    @GetMapping()
    public List<Product> retriveAll(){
        return service.retriveAll();
    }
}
