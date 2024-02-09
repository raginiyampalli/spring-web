package com.src.web.controller;

import com.src.web.model.Health;
import com.src.web.model.Product;
import com.src.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    ProductService productService;
    @Autowired
    ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/product")
    public Product getProduct(@RequestParam int productId){
        Product product = productService.getProductById(productId);
        return product;
    }

    @GetMapping("/health")
    public Health isHealthy(){
        return new Health();
    }


}
