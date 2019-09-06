package com.alfinandika.training.microservice2019.frontend.service;

import com.alfinandika.training.microservice2019.frontend.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@FeignClient(name = "catalog", fallback = CatalogServiceFallback.class)
public interface CatalogService {

    @GetMapping("/api/product/")
    public Iterable<Product> dataProduct();

    @GetMapping("/api/host/")
    Map<String, Object> backendInfo();
}
