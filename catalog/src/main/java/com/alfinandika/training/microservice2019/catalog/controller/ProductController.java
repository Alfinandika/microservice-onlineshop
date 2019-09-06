package com.alfinandika.training.microservice2019.catalog.controller;


import com.alfinandika.training.microservice2019.catalog.dao.ProductDao;
import com.alfinandika.training.microservice2019.catalog.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("api/product/")
    public Iterable<Product> allProduct(){
        return productDao.findAll();
    }
}
