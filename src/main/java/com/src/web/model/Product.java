package com.src.web.model;

public class Product {

    private Integer id;
    private String name;
    private Integer price;

    private String error;

    public Product(Integer id, String name, Integer price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product (String error){
        this.error = error;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
