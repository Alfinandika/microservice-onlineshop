package com.alfinandika.training.microservice2019.frontend.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    private String Id;
    private String code;
    private String name;
    private BigDecimal price;
}
