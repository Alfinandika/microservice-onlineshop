package com.alfinandika.training.microservice2019.frontend.controller;

import com.alfinandika.training.microservice2019.frontend.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("product/list")
    public ModelMap daftarProduct(){
        return new ModelMap()
                .addAttribute("productData", catalogService.dataProduct());
    }
}
