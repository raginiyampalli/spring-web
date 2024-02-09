package com.src.web.service;

import com.src.web.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    Map<Integer,Product> productsMap = new HashMap<>();
    ProductService(){
        productsMap.put(1,new Product(1,"Phone",3000));
        productsMap.put(101,new Product(1,"Fridge",5000));

    }

    public Product getProductById(Integer id){
        if(productsMap.containsKey(id)){
            return productsMap.get(id);
        }
        return null;
    }
}
