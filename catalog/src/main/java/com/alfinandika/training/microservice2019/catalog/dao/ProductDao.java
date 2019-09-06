package com.alfinandika.training.microservice2019.catalog.dao;

import com.alfinandika.training.microservice2019.catalog.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {
}
