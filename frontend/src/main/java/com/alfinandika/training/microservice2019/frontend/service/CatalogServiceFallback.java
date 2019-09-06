package com.alfinandika.training.microservice2019.frontend.service;

import com.alfinandika.training.microservice2019.frontend.dto.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class CatalogServiceFallback implements CatalogService {
    @Override
    public Iterable<Product> dataProduct() {
        return new ArrayList<>();
    }

    @Override
    public Map<String, Object> backendInfo() {
        Map<String, Object> defaultValue = new HashMap<>();
        defaultValue.put("host", "localhost");
        defaultValue.put("address", "127.0.0.1");
        defaultValue.put("port", 0);
        return defaultValue;
    }
}
