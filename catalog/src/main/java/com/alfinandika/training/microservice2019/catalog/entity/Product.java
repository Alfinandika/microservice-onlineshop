package com.alfinandika.training.microservice2019.catalog.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity @Data
public class Product {

    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    private String Id;

    @NotEmpty @Size(min = 3, max = 100)
    private String code;

    @NotEmpty @Size(min = 3, max = 100)
    private String name;

    @NotNull @Size(min = 1)
    private BigDecimal price;
}
